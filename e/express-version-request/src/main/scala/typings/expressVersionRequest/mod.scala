package typings.expressVersionRequest

import typings.express.mod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-version-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatVersion(version: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatVersion")(version.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatVersion(version: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatVersion")(version.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def setVersion(version: String): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("setVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  @scala.inline
  def setVersionByAcceptHeader(): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("setVersionByAcceptHeader")().asInstanceOf[Handler]
  @scala.inline
  def setVersionByAcceptHeader(customParsingFunction: CustomParsingFunction): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("setVersionByAcceptHeader")(customParsingFunction.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  @scala.inline
  def setVersionByHeader(): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("setVersionByHeader")().asInstanceOf[Handler]
  @scala.inline
  def setVersionByHeader(headerName: String): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("setVersionByHeader")(headerName.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  @scala.inline
  def setVersionByQueryParam(): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("setVersionByQueryParam")().asInstanceOf[Handler]
  @scala.inline
  def setVersionByQueryParam(queryParam: String): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("setVersionByQueryParam")(queryParam.asInstanceOf[js.Any]).asInstanceOf[Handler]
  @scala.inline
  def setVersionByQueryParam(queryParam: String, options: SetVersionByQueryParamOptions): Handler = (^.asInstanceOf[js.Dynamic].applyDynamic("setVersionByQueryParam")(queryParam.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  @scala.inline
  def setVersionByQueryParam(queryParam: Unit, options: SetVersionByQueryParamOptions): Handler = (^.asInstanceOf[js.Dynamic].applyDynamic("setVersionByQueryParam")(queryParam.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  type CustomParsingFunction = js.Function1[/* header */ js.UndefOr[String], String]
  
  trait SetVersionByQueryParamOptions extends StObject {
    
    var removeQueryParam: Boolean
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
