package typings.geojsonEquality

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<{  precision :number,   direction :boolean, objectComparator (a : std.Record<string, any>, b : std.Record<string, any>): boolean}> */
  trait Partialprecisionnumberdir extends StObject {
    
    var direction: js.UndefOr[Boolean] = js.undefined
    
    var objectComparator: js.UndefOr[js.Function2[/* a */ Record[String, Any], /* b */ Record[String, Any], Boolean]] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
  }
  object Partialprecisionnumberdir {
    
    inline def apply(): Partialprecisionnumberdir = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialprecisionnumberdir]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Partialprecisionnumberdir] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: Boolean): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setObjectComparator(value: (/* a */ Record[String, Any], /* b */ Record[String, Any]) => Boolean): Self = StObject.set(x, "objectComparator", js.Any.fromFunction2(value))
      
      inline def setObjectComparatorUndefined: Self = StObject.set(x, "objectComparator", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    }
  }
}
