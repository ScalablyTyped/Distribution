package typings.du

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("du", JSImport.Namespace)
  @js.native
  def apply(dir: String): js.Promise[Double] = js.native
  @JSImport("du", JSImport.Namespace)
  @js.native
  def apply(dir: String, callback: js.Function2[/* err */ Error | Null, /* data */ js.UndefOr[Double], _]): Unit = js.native
  @JSImport("du", JSImport.Namespace)
  @js.native
  def apply(dir: String, options: Options): js.Promise[Double] = js.native
  @JSImport("du", JSImport.Namespace)
  @js.native
  def apply(
    dir: String,
    options: Options,
    callback: js.Function2[/* err */ Error | Null, /* data */ js.UndefOr[Double], _]
  ): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var disk: js.UndefOr[Boolean] = js.native
    
    var filter: js.UndefOr[js.Function1[/* dir */ String, Boolean]] = js.native
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
