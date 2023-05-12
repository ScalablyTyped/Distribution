package typings.framerMotion.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait LazyProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Can be used to provide a feature bundle synchronously or asynchronously.
    *
    * ```jsx
    * // features.js
    * import { domAnimation } from "framer-motion"
    * export default domAnimation
    *
    * // index.js
    * import { LazyMotion, m } from "framer-motion"
    *
    * const loadFeatures = import("./features.js")
    *   .then(res => res.default)
    *
    * function Component() {
    *   return (
    *     <LazyMotion features={loadFeatures}>
    *       <m.div animate={{ scale: 1.5 }} />
    *     </LazyMotion>
    *   )
    * }
    * ```
    *
    * @public
    */
  var features: FeatureBundle | LazyFeatureBundle1
  
  /**
    * If `true`, will throw an error if a `motion` component renders within
    * a `LazyMotion` component.
    *
    * ```jsx
    * // This component will throw an error that explains using a motion component
    * // instead of the m component will break the benefits of code-splitting.
    * function Component() {
    *   return (
    *     <LazyMotion features={domAnimation} strict>
    *       <motion.div />
    *     </LazyMotion>
    *   )
    * }
    * ```
    *
    * @public
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}
object LazyProps {
  
  inline def apply(features: FeatureBundle | LazyFeatureBundle1): LazyProps = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LazyProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setFeatures(value: FeatureBundle | LazyFeatureBundle1): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesFunction0(value: () => js.Promise[FeatureBundle]): Self = StObject.set(x, "features", js.Any.fromFunction0(value))
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
