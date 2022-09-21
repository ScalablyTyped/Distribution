package typings.electronPublish

import typings.builderUtil.archMod.Arch
import typings.builderUtilRuntime.publishOptionsMod.GithubOptions
import typings.electronPublish.mod.HttpPublisher
import typings.electronPublish.mod.PublishContext
import typings.electronPublish.mod.PublishOptions
import typings.lazyVal.mod.Lazy
import typings.node.httpMod.ClientRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitHubPublisherMod {
  
  @JSImport("electron-publish/out/gitHubPublisher", "GitHubPublisher")
  @js.native
  open class GitHubPublisher protected () extends HttpPublisher {
    def this(context: PublishContext, info: GithubOptions, version: String) = this()
    def this(context: PublishContext, info: GithubOptions, version: String, options: PublishOptions) = this()
    
    val _release: Lazy[Any] = js.native
    
    /* private */ var createRelease: Any = js.native
    
    def deleteRelease(): js.Promise[Any] = js.native
    
    /* protected */ def doUpload(
      fileName: String,
      arch: Arch,
      dataLength: Double,
      requestProcessor: js.Function2[
          /* request */ ClientRequest, 
          /* reject */ js.Function1[/* error */ js.Error, Unit], 
          Unit
        ]
    ): js.Promise[Any] = js.native
    
    /* private */ var doUploadFile: Any = js.native
    
    /* private */ var doesErrorMeanAlreadyExists: Any = js.native
    
    /* private */ var getOrCreateRelease: Any = js.native
    
    def getRelease(): js.Promise[Any] = js.native
    
    /* private */ var githubRequest: Any = js.native
    
    /* private */ val info: Any = js.native
    
    /* private */ val options: Any = js.native
    
    /* private */ var overwriteArtifact: Any = js.native
    
    @JSName("providerName")
    val providerName_FGitHubPublisher: /* "github" */ String = js.native
    
    /* private */ var releaseLogFields: Any = js.native
    
    /* private */ val releaseType: Any = js.native
    
    /* private */ val tag: Any = js.native
    
    /* private */ val token: Any = js.native
    
    /* private */ val version: Any = js.native
  }
  
  trait Release extends StObject {
    
    var draft: Boolean
    
    var id: Double
    
    var prerelease: Boolean
    
    var published_at: String
    
    var tag_name: String
    
    var upload_url: String
  }
  object Release {
    
    inline def apply(
      draft: Boolean,
      id: Double,
      prerelease: Boolean,
      published_at: String,
      tag_name: String,
      upload_url: String
    ): Release = {
      val __obj = js.Dynamic.literal(draft = draft.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Release]
    }
    
    extension [Self <: Release](x: Self) {
      
      inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrerelease(value: Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
      
      inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
      
      inline def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
      
      inline def setUpload_url(value: String): Self = StObject.set(x, "upload_url", value.asInstanceOf[js.Any])
    }
  }
}
