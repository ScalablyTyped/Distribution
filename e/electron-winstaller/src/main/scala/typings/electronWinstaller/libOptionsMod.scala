package typings.electronWinstaller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptionsMod {
  
  trait AdditionalFile extends StObject {
    
    var src: String
    
    var target: String
  }
  object AdditionalFile {
    
    inline def apply(src: String, target: String): AdditionalFile = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdditionalFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdditionalFile] (val x: Self) extends AnyVal {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metadata extends StObject {
    
    var additionalFiles: js.UndefOr[js.Array[AdditionalFile]] = js.undefined
    
    var author: js.UndefOr[String | PersonMetadata] = js.undefined
    
    var authors: js.UndefOr[String | js.Array[PersonMetadata]] = js.undefined
    
    var copyright: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var iconUrl: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var owners: js.UndefOr[String | js.Array[PersonMetadata]] = js.undefined
    
    var productName: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Metadata {
    
    inline def apply(): Metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      inline def setAdditionalFiles(value: js.Array[AdditionalFile]): Self = StObject.set(x, "additionalFiles", value.asInstanceOf[js.Any])
      
      inline def setAdditionalFilesUndefined: Self = StObject.set(x, "additionalFiles", js.undefined)
      
      inline def setAdditionalFilesVarargs(value: AdditionalFile*): Self = StObject.set(x, "additionalFiles", js.Array(value*))
      
      inline def setAuthor(value: String | PersonMetadata): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setAuthors(value: String | js.Array[PersonMetadata]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      inline def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
      
      inline def setAuthorsVarargs(value: PersonMetadata*): Self = StObject.set(x, "authors", js.Array(value*))
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOwners(value: String | js.Array[PersonMetadata]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
      
      inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
      
      inline def setOwnersVarargs(value: PersonMetadata*): Self = StObject.set(x, "owners", js.Array(value*))
      
      inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
      
      inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait PersonMetadata extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object PersonMetadata {
    
    inline def apply(name: String): PersonMetadata = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersonMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersonMetadata] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait SquirrelWindowsOptions extends StObject {
    
    /**
      * The folder path of your Electron app
      */
    var appDirectory: String
    
    /**
      * The authors value for the nuget package metadata.
      *
      * Defaults to the `author` field from your app's package.json file when unspecified.
      */
    var authors: js.UndefOr[String] = js.undefined
    
    /**
      * The path to an Authenticode Code Signing Certificate
      */
    var certificateFile: js.UndefOr[String] = js.undefined
    
    /**
      * The password to decrypt the certificate given in `certificateFile`
      */
    var certificatePassword: js.UndefOr[String] = js.undefined
    
    /**
      * The copyright value for the nuget package metadata.
      *
      * Defaults to a generated copyright with `authors` or `owners`.
      */
    var copyright: js.UndefOr[String] = js.undefined
    
    /**
      * The description value for the nuget package metadata.
      *
      * Defaults to the `description` field from your app's package.json file when unspecified.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The name of your app's main `.exe` file.
      *
      * This uses the `name` field in your app's package.json file with an added `.exe` extension when unspecified.
      */
    var exe: js.UndefOr[String] = js.undefined
    
    var fixUpPaths: js.UndefOr[Boolean] = js.undefined
    
    var frameworkVersion: js.UndefOr[String] = js.undefined
    
    /**
      * A publicly accessible, fully qualified HTTP(S) URL to an ICO file, used as the application icon
      * displayed in Control Panel ➡ Programs and Features. The icon is retrieved at install time.
      * Example: http://example.com/favicon.ico
      *
      * Does not accept `file:` URLs.
      *
      * Defaults to the Electron icon.
      */
    var iconUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The local path to a `.gif` file to display during install.
      */
    var loadingGif: js.UndefOr[String] = js.undefined
    
    /**
      * Windows Application Model ID (appId).
      *
      * Defaults to the name field in your app's package.json file.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Should Squirrel.Windows delta packages? (disable only if necessary, they are a Good Thing)
      */
    var noDelta: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should Squirrel.Windows create an MSI installer?
      */
    var noMsi: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The folder path to create the .exe installer in.
      *
      * Defaults to the installer folder at the project root.
      */
    var outputDirectory: js.UndefOr[String] = js.undefined
    
    /**
      * The owners value for the nuget package metadata.
      *
      * Defaults to the `authors` field when unspecified.
      */
    var owners: js.UndefOr[String] = js.undefined
    
    /**
      * A URL to your existing updates. If given, these will be downloaded to create delta updates
      */
    var remoteReleases: js.UndefOr[String] = js.undefined
    
    /**
      * Authentication token for remote updates
      */
    var remoteToken: js.UndefOr[String] = js.undefined
    
    /**
      * The name to use for the generated Setup.exe file
      */
    var setupExe: js.UndefOr[String] = js.undefined
    
    /**
      * The ICO file to use as the icon for the generated Setup.exe
      */
    var setupIcon: js.UndefOr[String] = js.undefined
    
    /**
      * The name to use for the generated Setup.msi file
      */
    var setupMsi: js.UndefOr[String] = js.undefined
    
    /**
      * Params to pass to signtool.
      *
      * Overrides `certificateFile` and `certificatePassword`.
      */
    var signWithParams: js.UndefOr[String] = js.undefined
    
    var skipUpdateIcon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The title value for the nuget package metadata.
      *
      * Defaults to the `productName` field and then the `name` field from your app's package.json file when unspecified.
      */
    var title: js.UndefOr[String] = js.undefined
    
    var usePackageJson: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The version value for the nuget package metadata.
      *
      * Defaults to the `version` field from your app's package.json file when unspecified.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object SquirrelWindowsOptions {
    
    inline def apply(appDirectory: String): SquirrelWindowsOptions = {
      val __obj = js.Dynamic.literal(appDirectory = appDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[SquirrelWindowsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SquirrelWindowsOptions] (val x: Self) extends AnyVal {
      
      inline def setAppDirectory(value: String): Self = StObject.set(x, "appDirectory", value.asInstanceOf[js.Any])
      
      inline def setAuthors(value: String): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      inline def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
      
      inline def setCertificateFile(value: String): Self = StObject.set(x, "certificateFile", value.asInstanceOf[js.Any])
      
      inline def setCertificateFileUndefined: Self = StObject.set(x, "certificateFile", js.undefined)
      
      inline def setCertificatePassword(value: String): Self = StObject.set(x, "certificatePassword", value.asInstanceOf[js.Any])
      
      inline def setCertificatePasswordUndefined: Self = StObject.set(x, "certificatePassword", js.undefined)
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExe(value: String): Self = StObject.set(x, "exe", value.asInstanceOf[js.Any])
      
      inline def setExeUndefined: Self = StObject.set(x, "exe", js.undefined)
      
      inline def setFixUpPaths(value: Boolean): Self = StObject.set(x, "fixUpPaths", value.asInstanceOf[js.Any])
      
      inline def setFixUpPathsUndefined: Self = StObject.set(x, "fixUpPaths", js.undefined)
      
      inline def setFrameworkVersion(value: String): Self = StObject.set(x, "frameworkVersion", value.asInstanceOf[js.Any])
      
      inline def setFrameworkVersionUndefined: Self = StObject.set(x, "frameworkVersion", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setLoadingGif(value: String): Self = StObject.set(x, "loadingGif", value.asInstanceOf[js.Any])
      
      inline def setLoadingGifUndefined: Self = StObject.set(x, "loadingGif", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoDelta(value: Boolean): Self = StObject.set(x, "noDelta", value.asInstanceOf[js.Any])
      
      inline def setNoDeltaUndefined: Self = StObject.set(x, "noDelta", js.undefined)
      
      inline def setNoMsi(value: Boolean): Self = StObject.set(x, "noMsi", value.asInstanceOf[js.Any])
      
      inline def setNoMsiUndefined: Self = StObject.set(x, "noMsi", js.undefined)
      
      inline def setOutputDirectory(value: String): Self = StObject.set(x, "outputDirectory", value.asInstanceOf[js.Any])
      
      inline def setOutputDirectoryUndefined: Self = StObject.set(x, "outputDirectory", js.undefined)
      
      inline def setOwners(value: String): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
      
      inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
      
      inline def setRemoteReleases(value: String): Self = StObject.set(x, "remoteReleases", value.asInstanceOf[js.Any])
      
      inline def setRemoteReleasesUndefined: Self = StObject.set(x, "remoteReleases", js.undefined)
      
      inline def setRemoteToken(value: String): Self = StObject.set(x, "remoteToken", value.asInstanceOf[js.Any])
      
      inline def setRemoteTokenUndefined: Self = StObject.set(x, "remoteToken", js.undefined)
      
      inline def setSetupExe(value: String): Self = StObject.set(x, "setupExe", value.asInstanceOf[js.Any])
      
      inline def setSetupExeUndefined: Self = StObject.set(x, "setupExe", js.undefined)
      
      inline def setSetupIcon(value: String): Self = StObject.set(x, "setupIcon", value.asInstanceOf[js.Any])
      
      inline def setSetupIconUndefined: Self = StObject.set(x, "setupIcon", js.undefined)
      
      inline def setSetupMsi(value: String): Self = StObject.set(x, "setupMsi", value.asInstanceOf[js.Any])
      
      inline def setSetupMsiUndefined: Self = StObject.set(x, "setupMsi", js.undefined)
      
      inline def setSignWithParams(value: String): Self = StObject.set(x, "signWithParams", value.asInstanceOf[js.Any])
      
      inline def setSignWithParamsUndefined: Self = StObject.set(x, "signWithParams", js.undefined)
      
      inline def setSkipUpdateIcon(value: Boolean): Self = StObject.set(x, "skipUpdateIcon", value.asInstanceOf[js.Any])
      
      inline def setSkipUpdateIconUndefined: Self = StObject.set(x, "skipUpdateIcon", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUsePackageJson(value: Boolean): Self = StObject.set(x, "usePackageJson", value.asInstanceOf[js.Any])
      
      inline def setUsePackageJsonUndefined: Self = StObject.set(x, "usePackageJson", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
