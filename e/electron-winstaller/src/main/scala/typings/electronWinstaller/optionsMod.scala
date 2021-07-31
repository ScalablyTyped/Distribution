package typings.electronWinstaller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  trait Metadata extends StObject {
    
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
    
    @scala.inline
    def apply(): Metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String | PersonMetadata): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setAuthors(value: String | js.Array[PersonMetadata]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
      
      @scala.inline
      def setAuthorsVarargs(value: PersonMetadata*): Self = StObject.set(x, "authors", js.Array(value :_*))
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwners(value: String | js.Array[PersonMetadata]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
      
      @scala.inline
      def setOwnersVarargs(value: PersonMetadata*): Self = StObject.set(x, "owners", js.Array(value :_*))
      
      @scala.inline
      def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
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
  object Options {
    
    @scala.inline
    def apply(appDirectory: String): Options = {
      val __obj = js.Dynamic.literal(appDirectory = appDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppDirectory(value: String): Self = StObject.set(x, "appDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthors(value: String): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
      
      @scala.inline
      def setCertificateFile(value: String): Self = StObject.set(x, "certificateFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateFileUndefined: Self = StObject.set(x, "certificateFile", js.undefined)
      
      @scala.inline
      def setCertificatePassword(value: String): Self = StObject.set(x, "certificatePassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificatePasswordUndefined: Self = StObject.set(x, "certificatePassword", js.undefined)
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExe(value: String): Self = StObject.set(x, "exe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExeUndefined: Self = StObject.set(x, "exe", js.undefined)
      
      @scala.inline
      def setFixUpPaths(value: Boolean): Self = StObject.set(x, "fixUpPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixUpPathsUndefined: Self = StObject.set(x, "fixUpPaths", js.undefined)
      
      @scala.inline
      def setFrameworkVersion(value: String): Self = StObject.set(x, "frameworkVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameworkVersionUndefined: Self = StObject.set(x, "frameworkVersion", js.undefined)
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      @scala.inline
      def setLoadingGif(value: String): Self = StObject.set(x, "loadingGif", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingGifUndefined: Self = StObject.set(x, "loadingGif", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoDelta(value: Boolean): Self = StObject.set(x, "noDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDeltaUndefined: Self = StObject.set(x, "noDelta", js.undefined)
      
      @scala.inline
      def setNoMsi(value: Boolean): Self = StObject.set(x, "noMsi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoMsiUndefined: Self = StObject.set(x, "noMsi", js.undefined)
      
      @scala.inline
      def setOutputDirectory(value: String): Self = StObject.set(x, "outputDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputDirectoryUndefined: Self = StObject.set(x, "outputDirectory", js.undefined)
      
      @scala.inline
      def setOwners(value: String): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
      
      @scala.inline
      def setRemoteReleases(value: String): Self = StObject.set(x, "remoteReleases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteReleasesUndefined: Self = StObject.set(x, "remoteReleases", js.undefined)
      
      @scala.inline
      def setRemoteToken(value: String): Self = StObject.set(x, "remoteToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteTokenUndefined: Self = StObject.set(x, "remoteToken", js.undefined)
      
      @scala.inline
      def setSetupExe(value: String): Self = StObject.set(x, "setupExe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupExeUndefined: Self = StObject.set(x, "setupExe", js.undefined)
      
      @scala.inline
      def setSetupIcon(value: String): Self = StObject.set(x, "setupIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupIconUndefined: Self = StObject.set(x, "setupIcon", js.undefined)
      
      @scala.inline
      def setSetupMsi(value: String): Self = StObject.set(x, "setupMsi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupMsiUndefined: Self = StObject.set(x, "setupMsi", js.undefined)
      
      @scala.inline
      def setSignWithParams(value: String): Self = StObject.set(x, "signWithParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignWithParamsUndefined: Self = StObject.set(x, "signWithParams", js.undefined)
      
      @scala.inline
      def setSkipUpdateIcon(value: Boolean): Self = StObject.set(x, "skipUpdateIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUpdateIconUndefined: Self = StObject.set(x, "skipUpdateIcon", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUsePackageJson(value: Boolean): Self = StObject.set(x, "usePackageJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePackageJsonUndefined: Self = StObject.set(x, "usePackageJson", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait PersonMetadata extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object PersonMetadata {
    
    @scala.inline
    def apply(name: String): PersonMetadata = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersonMetadata]
    }
    
    @scala.inline
    implicit class PersonMetadataMutableBuilder[Self <: PersonMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
