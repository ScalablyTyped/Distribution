package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconSequence extends StObject {
  
  /**
    * If <code>true</code>, each icon in the sequence has the same fixed
    * rotation regardless of the angle of the edge on which it lies. If
    * <code>false</code>, case each icon in the sequence is rotated to align
    * with its edge.
    * @defaultValue <code>false</code>
    */
  var fixedRotation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The icon to render on the line.
    */
  var icon: js.UndefOr[Null | Symbol] = js.undefined
  
  /**
    * The distance from the start of the line at which an icon is to be
    * rendered. This distance may be expressed as a percentage of line&#39;s
    * length (e.g.
    * &#39;50%&#39;) or in pixels (e.g. &#39;50px&#39;).
    * @defaultValue <code>&#39;100%&#39;</code>
    */
  var offset: js.UndefOr[String] = js.undefined
  
  /**
    * The distance between consecutive icons on the line. This distance may be
    * expressed as a percentage of the line&#39;s length (e.g. &#39;50%&#39;)
    * or in pixels (e.g. &#39;50px&#39;). To disable repeating of the icon,
    * specify
    * &#39;0&#39;.
    * @defaultValue <code>0</code>
    */
  var repeat: js.UndefOr[String] = js.undefined
}
object IconSequence {
  
  inline def apply(): IconSequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSequence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconSequence] (val x: Self) extends AnyVal {
    
    inline def setFixedRotation(value: Boolean): Self = StObject.set(x, "fixedRotation", value.asInstanceOf[js.Any])
    
    inline def setFixedRotationUndefined: Self = StObject.set(x, "fixedRotation", js.undefined)
    
    inline def setIcon(value: Symbol): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRepeat(value: String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
