package typings.giget

import org.scalablytyped.runtime.StringDictionary
import typings.giget.anon.Auth
import typings.giget.gigetBooleans.`false`
import typings.giget.gigetStrings.bitbucket
import typings.giget.gigetStrings.github
import typings.giget.gigetStrings.gitlab
import typings.giget.gigetStrings.sourcehut
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("giget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def downloadTemplate(input: String): js.Promise[DownloadTemplateResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadTemplate")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DownloadTemplateResult]]
  inline def downloadTemplate(input: String, options: DownloadTemplateOptions): js.Promise[DownloadTemplateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadTemplate")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DownloadTemplateResult]]
  
  inline def registryProvider(): TemplateProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("registryProvider")().asInstanceOf[TemplateProvider]
  inline def registryProvider(registryEndpoint: String): TemplateProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("registryProvider")(registryEndpoint.asInstanceOf[js.Any]).asInstanceOf[TemplateProvider]
  inline def registryProvider(registryEndpoint: String, options: Auth): TemplateProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("registryProvider")(registryEndpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TemplateProvider]
  inline def registryProvider(registryEndpoint: Unit, options: Auth): TemplateProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("registryProvider")(registryEndpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TemplateProvider]
  
  inline def startShell(cwd: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startShell")(cwd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait DownloadTemplateOptions extends StObject {
    
    var auth: js.UndefOr[String] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var forceClean: js.UndefOr[Boolean] = js.undefined
    
    var offline: js.UndefOr[Boolean] = js.undefined
    
    var preferOffline: js.UndefOr[Boolean] = js.undefined
    
    var provider: js.UndefOr[String] = js.undefined
    
    var providers: js.UndefOr[Record[String, TemplateProvider]] = js.undefined
    
    var registry: js.UndefOr[`false` | String] = js.undefined
  }
  object DownloadTemplateOptions {
    
    inline def apply(): DownloadTemplateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceClean(value: Boolean): Self = StObject.set(x, "forceClean", value.asInstanceOf[js.Any])
      
      inline def setForceCleanUndefined: Self = StObject.set(x, "forceClean", js.undefined)
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
      
      inline def setOfflineUndefined: Self = StObject.set(x, "offline", js.undefined)
      
      inline def setPreferOffline(value: Boolean): Self = StObject.set(x, "preferOffline", value.asInstanceOf[js.Any])
      
      inline def setPreferOfflineUndefined: Self = StObject.set(x, "preferOffline", js.undefined)
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setProviders(value: Record[String, TemplateProvider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
      
      inline def setRegistry(value: `false` | String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
  
  /* Inlined std.Omit<giget.giget.TemplateInfo, 'dir' | 'source'> & {  dir :string,   source :string} */
  trait DownloadTemplateResult extends StObject {
    
    var defaultDir: js.UndefOr[String] = js.undefined
    
    var dir: String
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var name: String
    
    var source: String
    
    var subdir: js.UndefOr[String] = js.undefined
    
    var tar: String
    
    var url: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object DownloadTemplateResult {
    
    inline def apply(dir: String, name: String, source: String, tar: String): DownloadTemplateResult = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tar = tar.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadTemplateResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadTemplateResult] (val x: Self) extends AnyVal {
      
      inline def setDefaultDir(value: String): Self = StObject.set(x, "defaultDir", value.asInstanceOf[js.Any])
      
      inline def setDefaultDirUndefined: Self = StObject.set(x, "defaultDir", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSubdir(value: String): Self = StObject.set(x, "subdir", value.asInstanceOf[js.Any])
      
      inline def setSubdirUndefined: Self = StObject.set(x, "subdir", js.undefined)
      
      inline def setTar(value: String): Self = StObject.set(x, "tar", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait GitInfo extends StObject {
    
    var provider: github | gitlab | bitbucket | sourcehut
    
    var ref: String
    
    var repo: String
    
    var subdir: String
  }
  object GitInfo {
    
    inline def apply(provider: github | gitlab | bitbucket | sourcehut, ref: String, repo: String, subdir: String): GitInfo = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], subdir = subdir.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GitInfo] (val x: Self) extends AnyVal {
      
      inline def setProvider(value: github | gitlab | bitbucket | sourcehut): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      inline def setSubdir(value: String): Self = StObject.set(x, "subdir", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateInfo
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var defaultDir: js.UndefOr[String] = js.undefined
    
    var dir: js.UndefOr[scala.Nothing] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var name: String
    
    var source: js.UndefOr[scala.Nothing] = js.undefined
    
    var subdir: js.UndefOr[String] = js.undefined
    
    var tar: String
    
    var url: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object TemplateInfo {
    
    inline def apply(name: String, tar: String): TemplateInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tar = tar.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateInfo] (val x: Self) extends AnyVal {
      
      inline def setDefaultDir(value: String): Self = StObject.set(x, "defaultDir", value.asInstanceOf[js.Any])
      
      inline def setDefaultDirUndefined: Self = StObject.set(x, "defaultDir", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSubdir(value: String): Self = StObject.set(x, "subdir", value.asInstanceOf[js.Any])
      
      inline def setSubdirUndefined: Self = StObject.set(x, "subdir", js.undefined)
      
      inline def setTar(value: String): Self = StObject.set(x, "tar", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type TemplateProvider = js.Function2[
    /* input */ String, 
    /* options */ Auth, 
    TemplateInfo | js.Promise[TemplateInfo] | Null
  ]
}
