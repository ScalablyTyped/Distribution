package typings.gitlab

import org.scalablytyped.runtime.StringDictionary
import typings.gitlab.gitlabNumbers.`3`
import typings.gitlab.gitlabNumbers.`4`
import typings.gitlab.gitlabStrings.execution
import typings.gitlab.gitlabStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseServiceMod {
  
  @JSImport("gitlab/dist/types/core/infrastructure/BaseService", "BaseService")
  @js.native
  class BaseService () extends StObject {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    val camelize: Boolean = js.native
    
    val headers: StringDictionary[String] = js.native
    
    val rejectUnauthorized: Boolean = js.native
    
    val requestTimeout: Double = js.native
    
    val requester: Requester = js.native
    
    val url: String = js.native
  }
  
  @js.native
  trait BaseServiceOptions extends StObject {
    
    var camelize: js.UndefOr[Boolean] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var jobToken: js.UndefOr[String] = js.native
    
    var oauthToken: js.UndefOr[String] = js.native
    
    var profileMode: js.UndefOr[execution | memory] = js.native
    
    var profileToken: js.UndefOr[String] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    var requestTimeout: js.UndefOr[Double] = js.native
    
    var requester: js.UndefOr[Requester] = js.native
    
    var sudo: js.UndefOr[String | Double] = js.native
    
    var token: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[`3` | `4`] = js.native
  }
  object BaseServiceOptions {
    
    @scala.inline
    def apply(): BaseServiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseServiceOptions]
    }
    
    @scala.inline
    implicit class BaseServiceOptionsMutableBuilder[Self <: BaseServiceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCamelize(value: Boolean): Self = StObject.set(x, "camelize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamelizeUndefined: Self = StObject.set(x, "camelize", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setJobToken(value: String): Self = StObject.set(x, "jobToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobTokenUndefined: Self = StObject.set(x, "jobToken", js.undefined)
      
      @scala.inline
      def setOauthToken(value: String): Self = StObject.set(x, "oauthToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauthTokenUndefined: Self = StObject.set(x, "oauthToken", js.undefined)
      
      @scala.inline
      def setProfileMode(value: execution | memory): Self = StObject.set(x, "profileMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileModeUndefined: Self = StObject.set(x, "profileMode", js.undefined)
      
      @scala.inline
      def setProfileToken(value: String): Self = StObject.set(x, "profileToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileTokenUndefined: Self = StObject.set(x, "profileToken", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      @scala.inline
      def setRequester(value: Requester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
      
      @scala.inline
      def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setVersion(value: `3` | `4`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Requester extends StObject {
    
    var delete: js.Function = js.native
    
    var get: js.Function = js.native
    
    var post: js.Function = js.native
    
    var put: js.Function = js.native
    
    var stream: js.UndefOr[js.Function] = js.native
  }
  object Requester {
    
    @scala.inline
    def apply(delete: js.Function, get: js.Function, post: js.Function, put: js.Function): Requester = {
      val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
      __obj.asInstanceOf[Requester]
    }
    
    @scala.inline
    implicit class RequesterMutableBuilder[Self <: Requester] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: js.Function): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet(value: js.Function): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPost(value: js.Function): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPut(value: js.Function): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream(value: js.Function): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
}
