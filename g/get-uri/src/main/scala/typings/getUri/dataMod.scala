package typings.getUri

import typings.getUri.mod.GetUriOptions
import typings.node.streamMod.Readable
import typings.node.urlMod.UrlWithStringQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @JSImport("get-uri/dist/data", JSImport.Default)
  @js.native
  def default(hasHref: UrlWithStringQuery, hasCache: DataOptions): js.Promise[Readable] = js.native
  
  @js.native
  trait DataOptions extends GetUriOptions {
    
    @JSName("cache")
    var cache_DataOptions: js.UndefOr[DataReadable] = js.native
  }
  object DataOptions {
    
    @scala.inline
    def apply(): DataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataOptions]
    }
    
    @scala.inline
    implicit class DataOptionsMutableBuilder[Self <: DataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: DataReadable): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
  
  @js.native
  trait DataReadable extends Readable {
    
    var hash: js.UndefOr[String] = js.native
  }
}
