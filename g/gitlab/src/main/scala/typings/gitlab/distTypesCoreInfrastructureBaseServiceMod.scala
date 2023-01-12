package typings.gitlab

import org.scalablytyped.runtime.StringDictionary
import typings.gitlab.gitlabInts.`3`
import typings.gitlab.gitlabInts.`4`
import typings.gitlab.gitlabStrings.execution
import typings.gitlab.gitlabStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreInfrastructureBaseServiceMod {
  
  @JSImport("gitlab/dist/types/core/infrastructure/BaseService", "BaseService")
  @js.native
  open class BaseService () extends StObject {
    def this(param0: BaseServiceOptions) = this()
    
    val camelize: Boolean = js.native
    
    val headers: StringDictionary[String] = js.native
    
    val rejectUnauthorized: Boolean = js.native
    
    val requestTimeout: Double = js.native
    
    val requester: Requester = js.native
    
    val url: String = js.native
  }
  
  trait BaseServiceOptions extends StObject {
    
    var camelize: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var jobToken: js.UndefOr[String] = js.undefined
    
    var oauthToken: js.UndefOr[String] = js.undefined
    
    var profileMode: js.UndefOr[execution | memory] = js.undefined
    
    var profileToken: js.UndefOr[String] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var requestTimeout: js.UndefOr[Double] = js.undefined
    
    var requester: js.UndefOr[Requester] = js.undefined
    
    var sudo: js.UndefOr[String | Double] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[`3` | `4`] = js.undefined
  }
  object BaseServiceOptions {
    
    inline def apply(): BaseServiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseServiceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseServiceOptions] (val x: Self) extends AnyVal {
      
      inline def setCamelize(value: Boolean): Self = StObject.set(x, "camelize", value.asInstanceOf[js.Any])
      
      inline def setCamelizeUndefined: Self = StObject.set(x, "camelize", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setJobToken(value: String): Self = StObject.set(x, "jobToken", value.asInstanceOf[js.Any])
      
      inline def setJobTokenUndefined: Self = StObject.set(x, "jobToken", js.undefined)
      
      inline def setOauthToken(value: String): Self = StObject.set(x, "oauthToken", value.asInstanceOf[js.Any])
      
      inline def setOauthTokenUndefined: Self = StObject.set(x, "oauthToken", js.undefined)
      
      inline def setProfileMode(value: execution | memory): Self = StObject.set(x, "profileMode", value.asInstanceOf[js.Any])
      
      inline def setProfileModeUndefined: Self = StObject.set(x, "profileMode", js.undefined)
      
      inline def setProfileToken(value: String): Self = StObject.set(x, "profileToken", value.asInstanceOf[js.Any])
      
      inline def setProfileTokenUndefined: Self = StObject.set(x, "profileToken", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setRequester(value: Requester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
      
      inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
      
      inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
      
      inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: `3` | `4`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Requester extends StObject {
    
    var delete: js.Function
    
    var get: js.Function
    
    var post: js.Function
    
    var put: js.Function
    
    var stream: js.UndefOr[js.Function] = js.undefined
  }
  object Requester {
    
    inline def apply(delete: js.Function, get: js.Function, post: js.Function, put: js.Function): Requester = {
      val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
      __obj.asInstanceOf[Requester]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Requester] (val x: Self) extends AnyVal {
      
      inline def setDelete(value: js.Function): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setGet(value: js.Function): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setPost(value: js.Function): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPut(value: js.Function): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      inline def setStream(value: js.Function): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
}
