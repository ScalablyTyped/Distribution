package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait MotionAdvancedProps extends StObject {
  
  /**
    * Custom data to use to resolve dynamic variants differently for each animating component.
    *
    * ```jsx
    * const variants = {
    *   visible: (custom) => ({
    *     opacity: 1,
    *     transition: { delay: custom * 0.2 }
    *   })
    * }
    *
    * <motion.div custom={0} animate="visible" variants={variants} />
    * <motion.div custom={1} animate="visible" variants={variants} />
    * <motion.div custom={2} animate="visible" variants={variants} />
    * ```
    *
    * @public
    */
  var custom: js.UndefOr[Any] = js.undefined
  
  /**
    * @public
    * Set to `false` to prevent throwing an error when a `motion` component is used within a `LazyMotion` set to strict.
    */
  var ignoreStrict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @public
    * Set to `false` to prevent inheriting variant changes from its parent.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
}
object MotionAdvancedProps {
  
  inline def apply(): MotionAdvancedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionAdvancedProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionAdvancedProps] (val x: Self) extends AnyVal {
    
    inline def setCustom(value: Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setIgnoreStrict(value: Boolean): Self = StObject.set(x, "ignoreStrict", value.asInstanceOf[js.Any])
    
    inline def setIgnoreStrictUndefined: Self = StObject.set(x, "ignoreStrict", js.undefined)
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
  }
}
