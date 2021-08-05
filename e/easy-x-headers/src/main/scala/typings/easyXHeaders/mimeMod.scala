package typings.easyXHeaders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimeMod {
  
  @JSImport("mime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mime", "charsets")
  @js.native
  def charsets: Charsets_ = js.native
  inline def charsets_=(x: Charsets_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("charsets")(x.asInstanceOf[js.Any])
  
  inline def define(mimes: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(mimes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def `extension`(mime: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extension")(mime.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def load(filepath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filepath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def lookup(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Charsets_ extends StObject {
    
    def lookup(mime: String): String
  }
  object Charsets_ {
    
    inline def apply(lookup: String => String): Charsets_ = {
      val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup))
      __obj.asInstanceOf[Charsets_]
    }
    
    extension [Self <: Charsets_](x: Self) {
      
      inline def setLookup(value: String => String): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
    }
  }
}
