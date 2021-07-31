package typings.du

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(dir: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  @scala.inline
  def apply(dir: String, callback: js.Function2[/* err */ Error | Null, /* data */ js.UndefOr[Double], js.Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(dir: String, options: Options): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  @scala.inline
  def apply(
    dir: String,
    options: Options,
    callback: js.Function2[/* err */ Error | Null, /* data */ js.UndefOr[Double], js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("du", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var disk: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* dir */ String, Boolean]] = js.undefined
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
      def setDisk(value: Boolean): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
      
      @scala.inline
      def setFilter(value: /* dir */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
}
