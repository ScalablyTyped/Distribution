package typings.googleCloudTextToSpeech.anon

import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeof extends StObject {
  
  var defaults: Boolean
  
  /* standard es5 */
  def enums(): String
  def enums(value: Any): String
  @JSName("enums")
  var enums_Original: StringConstructor
  
  var keepCase: Boolean
  
  /* standard es5 */
  def longs(): String
  def longs(value: Any): String
  @JSName("longs")
  var longs_Original: StringConstructor
  
  var oneofs: Boolean
}
object Typeof {
  
  inline def apply(
    defaults: Boolean,
    enums: StringConstructor,
    keepCase: Boolean,
    longs: StringConstructor,
    oneofs: Boolean
  ): Typeof = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], enums = enums.asInstanceOf[js.Any], keepCase = keepCase.asInstanceOf[js.Any], longs = longs.asInstanceOf[js.Any], oneofs = oneofs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeof]
  }
  
  extension [Self <: Typeof](x: Self) {
    
    inline def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setEnums(value: StringConstructor): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    inline def setKeepCase(value: Boolean): Self = StObject.set(x, "keepCase", value.asInstanceOf[js.Any])
    
    inline def setLongs(value: StringConstructor): Self = StObject.set(x, "longs", value.asInstanceOf[js.Any])
    
    inline def setOneofs(value: Boolean): Self = StObject.set(x, "oneofs", value.asInstanceOf[js.Any])
  }
}
