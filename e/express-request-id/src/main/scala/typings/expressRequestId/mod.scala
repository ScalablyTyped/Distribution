package typings.expressRequestId

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-request-id", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  @JSImport("express-request-id", JSImport.Namespace)
  @js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var attributeName: js.UndefOr[String] = js.native
    
    var headerName: js.UndefOr[String] = js.native
    
    var setHeader: js.UndefOr[Boolean] = js.native
    
    var uuidVersion: js.UndefOr[String] = js.native
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
      def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
      
      @scala.inline
      def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
      
      @scala.inline
      def setSetHeader(value: Boolean): Self = StObject.set(x, "setHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetHeaderUndefined: Self = StObject.set(x, "setHeader", js.undefined)
      
      @scala.inline
      def setUuidVersion(value: String): Self = StObject.set(x, "uuidVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidVersionUndefined: Self = StObject.set(x, "uuidVersion", js.undefined)
    }
  }
}
