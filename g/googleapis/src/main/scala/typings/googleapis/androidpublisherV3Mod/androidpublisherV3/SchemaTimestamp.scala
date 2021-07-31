package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimestamp extends StObject {
  
  var nanos: js.UndefOr[Double] = js.undefined
  
  var seconds: js.UndefOr[String] = js.undefined
}
object SchemaTimestamp {
  
  @scala.inline
  def apply(): SchemaTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestamp]
  }
  
  @scala.inline
  implicit class SchemaTimestampMutableBuilder[Self <: SchemaTimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    @scala.inline
    def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
