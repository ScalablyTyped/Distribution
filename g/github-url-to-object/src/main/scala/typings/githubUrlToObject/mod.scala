package typings.githubUrlToObject

import typings.githubUrlToObject.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): Result | Null = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Result | Null]
  inline def apply(url: String, options: Options): Result | Null = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result | Null]
  inline def apply(url: Url): Result | Null = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Result | Null]
  inline def apply(url: Url, options: Options): Result | Null = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result | Null]
  
  @JSImport("github-url-to-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var enterprise: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEnterprise(value: Boolean): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
      
      inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var api_url: String
    
    var branch: String
    
    var clone_url: String
    
    var https_url: String
    
    var repo: String
    
    var tarball_url: String
    
    var travis_url: String
    
    var user: String
    
    var zip_url: String
  }
  object Result {
    
    inline def apply(
      api_url: String,
      branch: String,
      clone_url: String,
      https_url: String,
      repo: String,
      tarball_url: String,
      travis_url: String,
      user: String,
      zip_url: String
    ): Result = {
      val __obj = js.Dynamic.literal(api_url = api_url.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], clone_url = clone_url.asInstanceOf[js.Any], https_url = https_url.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tarball_url = tarball_url.asInstanceOf[js.Any], travis_url = travis_url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], zip_url = zip_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setApi_url(value: String): Self = StObject.set(x, "api_url", value.asInstanceOf[js.Any])
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setClone_url(value: String): Self = StObject.set(x, "clone_url", value.asInstanceOf[js.Any])
      
      inline def setHttps_url(value: String): Self = StObject.set(x, "https_url", value.asInstanceOf[js.Any])
      
      inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      inline def setTarball_url(value: String): Self = StObject.set(x, "tarball_url", value.asInstanceOf[js.Any])
      
      inline def setTravis_url(value: String): Self = StObject.set(x, "travis_url", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setZip_url(value: String): Self = StObject.set(x, "zip_url", value.asInstanceOf[js.Any])
    }
  }
}
