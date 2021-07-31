package typings.fileExists

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(filepath: String): Unit = ^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(filepath: String, callback: js.Function2[/* err */ Error | Null, /* exists */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    filepath: String,
    options: Unit,
    callback: js.Function2[/* err */ Error | Null, /* exists */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(filepath: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    filepath: String,
    options: Options,
    callback: js.Function2[/* err */ Error | Null, /* exists */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("file-exists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sync(filepath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filepath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def sync(filepath: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var root: js.UndefOr[String] = js.undefined
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
