package typings.easyXapiSupertest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimeMod {
  
  @JSImport("mime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mime", "charsets")
  @js.native
  def charsets: Charsets_ = js.native
  @scala.inline
  def charsets_=(x: Charsets_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("charsets")(x.asInstanceOf[js.Any])
  
  @JSImport("mime", "define")
  @js.native
  def define(mimes: js.Object): Unit = js.native
  
  @JSImport("mime", "extension")
  @js.native
  def extension(mime: String): String = js.native
  
  @JSImport("mime", "load")
  @js.native
  def load(filepath: String): Unit = js.native
  
  @JSImport("mime", "lookup")
  @js.native
  def lookup(path: String): String = js.native
  
  @js.native
  trait Charsets_ extends StObject {
    
    def lookup(mime: String): String = js.native
  }
  object Charsets_ {
    
    @scala.inline
    def apply(lookup: String => String): Charsets_ = {
      val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup))
      __obj.asInstanceOf[Charsets_]
    }
    
    @scala.inline
    implicit class Charsets_MutableBuilder[Self <: Charsets_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLookup(value: String => String): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
    }
  }
}
