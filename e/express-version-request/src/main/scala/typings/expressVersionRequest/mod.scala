package typings.expressVersionRequest

import typings.express.mod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-version-request", "formatVersion")
  @js.native
  def formatVersion(version: String): String = js.native
  @JSImport("express-version-request", "formatVersion")
  @js.native
  def formatVersion(version: js.Object): String = js.native
  
  @JSImport("express-version-request", "setVersion")
  @js.native
  def setVersion(version: String): Handler = js.native
  
  @JSImport("express-version-request", "setVersionByAcceptHeader")
  @js.native
  def setVersionByAcceptHeader(): Handler = js.native
  @JSImport("express-version-request", "setVersionByAcceptHeader")
  @js.native
  def setVersionByAcceptHeader(customParsingFunction: CustomParsingFunction): Handler = js.native
  
  @JSImport("express-version-request", "setVersionByHeader")
  @js.native
  def setVersionByHeader(): Handler = js.native
  @JSImport("express-version-request", "setVersionByHeader")
  @js.native
  def setVersionByHeader(headerName: String): Handler = js.native
  
  @JSImport("express-version-request", "setVersionByQueryParam")
  @js.native
  def setVersionByQueryParam(): Handler = js.native
  @JSImport("express-version-request", "setVersionByQueryParam")
  @js.native
  def setVersionByQueryParam(queryParam: js.UndefOr[scala.Nothing], options: SetVersionByQueryParamOptions): Handler = js.native
  @JSImport("express-version-request", "setVersionByQueryParam")
  @js.native
  def setVersionByQueryParam(queryParam: String): Handler = js.native
  @JSImport("express-version-request", "setVersionByQueryParam")
  @js.native
  def setVersionByQueryParam(queryParam: String, options: SetVersionByQueryParamOptions): Handler = js.native
  
  type CustomParsingFunction = js.Function1[/* header */ js.UndefOr[String], String]
  
  @js.native
  trait SetVersionByQueryParamOptions extends StObject {
    
    var removeQueryParam: Boolean = js.native
  }
  object SetVersionByQueryParamOptions {
    
    @scala.inline
    def apply(removeQueryParam: Boolean): SetVersionByQueryParamOptions = {
      val __obj = js.Dynamic.literal(removeQueryParam = removeQueryParam.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetVersionByQueryParamOptions]
    }
    
    @scala.inline
    implicit class SetVersionByQueryParamOptionsMutableBuilder[Self <: SetVersionByQueryParamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemoveQueryParam(value: Boolean): Self = StObject.set(x, "removeQueryParam", value.asInstanceOf[js.Any])
    }
  }
}
