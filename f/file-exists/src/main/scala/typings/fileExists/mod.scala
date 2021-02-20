package typings.fileExists

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("file-exists", JSImport.Namespace)
  @js.native
  def apply(filepath: String): Unit = js.native
  @JSImport("file-exists", JSImport.Namespace)
  @js.native
  def apply(filepath: String, callback: js.Function2[/* err */ Error | Null, /* exists */ Boolean, Unit]): Unit = js.native
  @JSImport("file-exists", JSImport.Namespace)
  @js.native
  def apply(
    filepath: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error | Null, /* exists */ Boolean, Unit]
  ): Unit = js.native
  @JSImport("file-exists", JSImport.Namespace)
  @js.native
  def apply(filepath: String, options: Options): Unit = js.native
  @JSImport("file-exists", JSImport.Namespace)
  @js.native
  def apply(
    filepath: String,
    options: Options,
    callback: js.Function2[/* err */ Error | Null, /* exists */ Boolean, Unit]
  ): Unit = js.native
  
  @JSImport("file-exists", "sync")
  @js.native
  def sync(filepath: String): Boolean = js.native
  @JSImport("file-exists", "sync")
  @js.native
  def sync(filepath: String, options: Options): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    var root: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
