package typings.electronPublish

import typings.builderUtilRuntime.publishOptionsMod.GithubOptions
import typings.electronPublish.mod.HttpPublisher
import typings.electronPublish.mod.PublishContext
import typings.electronPublish.mod.PublishOptions
import typings.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitHubPublisherMod {
  
  @JSImport("electron-publish/out/gitHubPublisher", "GitHubPublisher")
  @js.native
  class GitHubPublisher protected () extends HttpPublisher {
    def this(context: PublishContext, info: GithubOptions, version: String) = this()
    def this(context: PublishContext, info: GithubOptions, version: String, options: PublishOptions) = this()
    
    val _release: Lazy[_] = js.native
    
    var createRelease: js.Any = js.native
    
    def deleteRelease(): js.Promise[_] = js.native
    
    var doUploadFile: js.Any = js.native
    
    var getOrCreateRelease: js.Any = js.native
    
    def getRelease(): js.Promise[_] = js.native
    
    var githubRequest: js.Any = js.native
    
    val info: js.Any = js.native
    
    val options: js.Any = js.native
    
    var overwriteArtifact: js.Any = js.native
    
    @JSName("providerName")
    val providerName_FGitHubPublisher: /* "GitHub" */ String = js.native
    
    var releaseLogFields: js.Any = js.native
    
    val releaseType: js.Any = js.native
    
    val tag: js.Any = js.native
    
    val token: js.Any = js.native
    
    val version: js.Any = js.native
  }
  
  @js.native
  trait Release extends StObject {
    
    var draft: Boolean = js.native
    
    var id: Double = js.native
    
    var prerelease: Boolean = js.native
    
    var published_at: String = js.native
    
    var tag_name: String = js.native
    
    var upload_url: String = js.native
  }
  object Release {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ReleaseMutableBuilder[Self <: Release] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrerelease(value: Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_url(value: String): Self = StObject.set(x, "upload_url", value.asInstanceOf[js.Any])
    }
  }
}
