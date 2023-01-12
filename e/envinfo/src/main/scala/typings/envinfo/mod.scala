package typings.envinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("envinfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cli(options: CliOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("cli")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @JSImport("envinfo", "helpers")
  @js.native
  val helpers: Helpers_ = js.native
  
  inline def main(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")().asInstanceOf[js.Promise[String]]
  inline def main(config: Unit, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def main(config: Config): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def main(config: Config, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def run(config: RunConfig): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def run(config: RunConfig, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait CliOptions
    extends StObject
       with Options
       with Config {
    
    var all: js.UndefOr[Boolean] = js.undefined
    
    var helper: js.UndefOr[String] = js.undefined
    
    var preset: js.UndefOr[String] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  object CliOptions {
    
    inline def apply(): CliOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CliOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CliOptions] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setHelper(value: String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      inline def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
      
      inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    var Binaries: js.UndefOr[js.Array[String]] = js.undefined
    
    var Browsers: js.UndefOr[js.Array[String]] = js.undefined
    
    var Databases: js.UndefOr[js.Array[String]] = js.undefined
    
    var IDEs: js.UndefOr[js.Array[String]] = js.undefined
    
    var Languages: js.UndefOr[js.Array[String]] = js.undefined
    
    var Managers: js.UndefOr[js.Array[String]] = js.undefined
    
    var SDKs: js.UndefOr[js.Array[String]] = js.undefined
    
    var Servers: js.UndefOr[js.Array[String]] = js.undefined
    
    var System: js.UndefOr[js.Array[String]] = js.undefined
    
    var Utilities: js.UndefOr[js.Array[String]] = js.undefined
    
    var Virtualization: js.UndefOr[js.Array[String]] = js.undefined
    
    var npmGlobalPackages: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var npmPackages: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setBinaries(value: js.Array[String]): Self = StObject.set(x, "Binaries", value.asInstanceOf[js.Any])
      
      inline def setBinariesUndefined: Self = StObject.set(x, "Binaries", js.undefined)
      
      inline def setBinariesVarargs(value: String*): Self = StObject.set(x, "Binaries", js.Array(value*))
      
      inline def setBrowsers(value: js.Array[String]): Self = StObject.set(x, "Browsers", value.asInstanceOf[js.Any])
      
      inline def setBrowsersUndefined: Self = StObject.set(x, "Browsers", js.undefined)
      
      inline def setBrowsersVarargs(value: String*): Self = StObject.set(x, "Browsers", js.Array(value*))
      
      inline def setDatabases(value: js.Array[String]): Self = StObject.set(x, "Databases", value.asInstanceOf[js.Any])
      
      inline def setDatabasesUndefined: Self = StObject.set(x, "Databases", js.undefined)
      
      inline def setDatabasesVarargs(value: String*): Self = StObject.set(x, "Databases", js.Array(value*))
      
      inline def setIDEs(value: js.Array[String]): Self = StObject.set(x, "IDEs", value.asInstanceOf[js.Any])
      
      inline def setIDEsUndefined: Self = StObject.set(x, "IDEs", js.undefined)
      
      inline def setIDEsVarargs(value: String*): Self = StObject.set(x, "IDEs", js.Array(value*))
      
      inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "Languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesUndefined: Self = StObject.set(x, "Languages", js.undefined)
      
      inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "Languages", js.Array(value*))
      
      inline def setManagers(value: js.Array[String]): Self = StObject.set(x, "Managers", value.asInstanceOf[js.Any])
      
      inline def setManagersUndefined: Self = StObject.set(x, "Managers", js.undefined)
      
      inline def setManagersVarargs(value: String*): Self = StObject.set(x, "Managers", js.Array(value*))
      
      inline def setNpmGlobalPackages(value: String | js.Array[String]): Self = StObject.set(x, "npmGlobalPackages", value.asInstanceOf[js.Any])
      
      inline def setNpmGlobalPackagesUndefined: Self = StObject.set(x, "npmGlobalPackages", js.undefined)
      
      inline def setNpmGlobalPackagesVarargs(value: String*): Self = StObject.set(x, "npmGlobalPackages", js.Array(value*))
      
      inline def setNpmPackages(value: String | js.Array[String]): Self = StObject.set(x, "npmPackages", value.asInstanceOf[js.Any])
      
      inline def setNpmPackagesUndefined: Self = StObject.set(x, "npmPackages", js.undefined)
      
      inline def setNpmPackagesVarargs(value: String*): Self = StObject.set(x, "npmPackages", js.Array(value*))
      
      inline def setSDKs(value: js.Array[String]): Self = StObject.set(x, "SDKs", value.asInstanceOf[js.Any])
      
      inline def setSDKsUndefined: Self = StObject.set(x, "SDKs", js.undefined)
      
      inline def setSDKsVarargs(value: String*): Self = StObject.set(x, "SDKs", js.Array(value*))
      
      inline def setServers(value: js.Array[String]): Self = StObject.set(x, "Servers", value.asInstanceOf[js.Any])
      
      inline def setServersUndefined: Self = StObject.set(x, "Servers", js.undefined)
      
      inline def setServersVarargs(value: String*): Self = StObject.set(x, "Servers", js.Array(value*))
      
      inline def setSystem(value: js.Array[String]): Self = StObject.set(x, "System", value.asInstanceOf[js.Any])
      
      inline def setSystemUndefined: Self = StObject.set(x, "System", js.undefined)
      
      inline def setSystemVarargs(value: String*): Self = StObject.set(x, "System", js.Array(value*))
      
      inline def setUtilities(value: js.Array[String]): Self = StObject.set(x, "Utilities", value.asInstanceOf[js.Any])
      
      inline def setUtilitiesUndefined: Self = StObject.set(x, "Utilities", js.undefined)
      
      inline def setUtilitiesVarargs(value: String*): Self = StObject.set(x, "Utilities", js.Array(value*))
      
      inline def setVirtualization(value: js.Array[String]): Self = StObject.set(x, "Virtualization", value.asInstanceOf[js.Any])
      
      inline def setVirtualizationUndefined: Self = StObject.set(x, "Virtualization", js.undefined)
      
      inline def setVirtualizationVarargs(value: String*): Self = StObject.set(x, "Virtualization", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.envinfo.envinfoStrings.getNodeInfo
    - typings.envinfo.envinfoStrings.getnpmInfo
    - typings.envinfo.envinfoStrings.getWatchmanInfo
    - typings.envinfo.envinfoStrings.getYarnInfo
    - typings.envinfo.envinfoStrings.getBraveBrowserInfo
    - typings.envinfo.envinfoStrings.getChromeInfo
    - typings.envinfo.envinfoStrings.getChromeCanaryInfo
    - typings.envinfo.envinfoStrings.getEdgeInfo
    - typings.envinfo.envinfoStrings.getFirefoxInfo
    - typings.envinfo.envinfoStrings.getFirefoxDeveloperEditionInfo
    - typings.envinfo.envinfoStrings.getFirefoxNightlyInfo
    - typings.envinfo.envinfoStrings.getInternetExplorerInfo
    - typings.envinfo.envinfoStrings.getSafariTechnologyPreviewInfo
    - typings.envinfo.envinfoStrings.getSafariInfo
    - typings.envinfo.envinfoStrings.getMongoDBInfo
    - typings.envinfo.envinfoStrings.getMySQLInfo
    - typings.envinfo.envinfoStrings.getPostgreSQLInfo
    - typings.envinfo.envinfoStrings.getSQLiteInfo
    - typings.envinfo.envinfoStrings.getAndroidStudioInfo
    - typings.envinfo.envinfoStrings.getAtomInfo
    - typings.envinfo.envinfoStrings.getEmacsInfo
    - typings.envinfo.envinfoStrings.getIntelliJInfo
    - typings.envinfo.envinfoStrings.getNanoInfo
    - typings.envinfo.envinfoStrings.getNvimInfo
    - typings.envinfo.envinfoStrings.getPhpStormInfo
    - typings.envinfo.envinfoStrings.getSublimeTextInfo
    - typings.envinfo.envinfoStrings.getVimInfo
    - typings.envinfo.envinfoStrings.getVSCodeInfo
    - typings.envinfo.envinfoStrings.getVisualStudioInfo
    - typings.envinfo.envinfoStrings.getWebStormInfo
    - typings.envinfo.envinfoStrings.getXcodeInfo
    - typings.envinfo.envinfoStrings.getBashInfo
    - typings.envinfo.envinfoStrings.getElixirInfo
    - typings.envinfo.envinfoStrings.getErlangInfo
    - typings.envinfo.envinfoStrings.getGoInfo
    - typings.envinfo.envinfoStrings.getJavaInfo
    - typings.envinfo.envinfoStrings.getPerlInfo
    - typings.envinfo.envinfoStrings.getPHPInfo
    - typings.envinfo.envinfoStrings.getProtocInfo
    - typings.envinfo.envinfoStrings.getPythonInfo
    - typings.envinfo.envinfoStrings.getPython3Info
    - typings.envinfo.envinfoStrings.getRInfo
    - typings.envinfo.envinfoStrings.getRubyInfo
    - typings.envinfo.envinfoStrings.getRustInfo
    - typings.envinfo.envinfoStrings.getScalaInfo
    - typings.envinfo.envinfoStrings.getAptInfo
    - typings.envinfo.envinfoStrings.getCargoInfo
    - typings.envinfo.envinfoStrings.getCocoaPodsInfo
    - typings.envinfo.envinfoStrings.getComposerInfo
    - typings.envinfo.envinfoStrings.getGradleInfo
    - typings.envinfo.envinfoStrings.getHomebrewInfo
    - typings.envinfo.envinfoStrings.getMavenInfo
    - typings.envinfo.envinfoStrings.getpip2Info
    - typings.envinfo.envinfoStrings.getpip3Info
    - typings.envinfo.envinfoStrings.getRubyGemsInfo
    - typings.envinfo.envinfoStrings.getYumInfo
    - typings.envinfo.envinfoStrings.getYarnWorkspacesInfo
    - typings.envinfo.envinfoStrings.getLernaInfo
    - typings.envinfo.envinfoStrings.getAndroidSDKInfo
    - typings.envinfo.envinfoStrings.getiOSSDKInfo
    - typings.envinfo.envinfoStrings.getWindowsSDKInfo
    - typings.envinfo.envinfoStrings.getApacheInfo
    - typings.envinfo.envinfoStrings.getNginxInfo
    - typings.envinfo.envinfoStrings.getContainerInfo
    - typings.envinfo.envinfoStrings.getCPUInfo
    - typings.envinfo.envinfoStrings.getMemoryInfo
    - typings.envinfo.envinfoStrings.getOSInfo
    - typings.envinfo.envinfoStrings.getShellInfo
    - typings.envinfo.envinfoStrings.getGLibcInfo
    - typings.envinfo.envinfoStrings.getBazelInfo
    - typings.envinfo.envinfoStrings.getCMakeInfo
    - typings.envinfo.envinfoStrings.getGCCInfo
    - typings.envinfo.envinfoStrings.getClangInfo
    - typings.envinfo.envinfoStrings.getGitInfo
    - typings.envinfo.envinfoStrings.getMakeInfo
    - typings.envinfo.envinfoStrings.getMercurialInfo
    - typings.envinfo.envinfoStrings.getSubversionInfo
    - typings.envinfo.envinfoStrings.getFFmpegInfo
    - typings.envinfo.envinfoStrings.getDockerInfo
    - typings.envinfo.envinfoStrings.getParallelsInfo
    - typings.envinfo.envinfoStrings.getVirtualBoxInfo
    - typings.envinfo.envinfoStrings.getVMwareFusionInfo
  */
  trait HelperNames extends StObject
  object HelperNames {
    
    inline def getAndroidSDKInfo: typings.envinfo.envinfoStrings.getAndroidSDKInfo = "getAndroidSDKInfo".asInstanceOf[typings.envinfo.envinfoStrings.getAndroidSDKInfo]
    
    inline def getAndroidStudioInfo: typings.envinfo.envinfoStrings.getAndroidStudioInfo = "getAndroidStudioInfo".asInstanceOf[typings.envinfo.envinfoStrings.getAndroidStudioInfo]
    
    inline def getApacheInfo: typings.envinfo.envinfoStrings.getApacheInfo = "getApacheInfo".asInstanceOf[typings.envinfo.envinfoStrings.getApacheInfo]
    
    inline def getAptInfo: typings.envinfo.envinfoStrings.getAptInfo = "getAptInfo".asInstanceOf[typings.envinfo.envinfoStrings.getAptInfo]
    
    inline def getAtomInfo: typings.envinfo.envinfoStrings.getAtomInfo = "getAtomInfo".asInstanceOf[typings.envinfo.envinfoStrings.getAtomInfo]
    
    inline def getBashInfo: typings.envinfo.envinfoStrings.getBashInfo = "getBashInfo".asInstanceOf[typings.envinfo.envinfoStrings.getBashInfo]
    
    inline def getBazelInfo: typings.envinfo.envinfoStrings.getBazelInfo = "getBazelInfo".asInstanceOf[typings.envinfo.envinfoStrings.getBazelInfo]
    
    inline def getBraveBrowserInfo: typings.envinfo.envinfoStrings.getBraveBrowserInfo = "getBraveBrowserInfo".asInstanceOf[typings.envinfo.envinfoStrings.getBraveBrowserInfo]
    
    inline def getCMakeInfo: typings.envinfo.envinfoStrings.getCMakeInfo = "getCMakeInfo".asInstanceOf[typings.envinfo.envinfoStrings.getCMakeInfo]
    
    inline def getCPUInfo: typings.envinfo.envinfoStrings.getCPUInfo = "getCPUInfo".asInstanceOf[typings.envinfo.envinfoStrings.getCPUInfo]
    
    inline def getCargoInfo: typings.envinfo.envinfoStrings.getCargoInfo = "getCargoInfo".asInstanceOf[typings.envinfo.envinfoStrings.getCargoInfo]
    
    inline def getChromeCanaryInfo: typings.envinfo.envinfoStrings.getChromeCanaryInfo = "getChromeCanaryInfo".asInstanceOf[typings.envinfo.envinfoStrings.getChromeCanaryInfo]
    
    inline def getChromeInfo: typings.envinfo.envinfoStrings.getChromeInfo = "getChromeInfo".asInstanceOf[typings.envinfo.envinfoStrings.getChromeInfo]
    
    inline def getClangInfo: typings.envinfo.envinfoStrings.getClangInfo = "getClangInfo".asInstanceOf[typings.envinfo.envinfoStrings.getClangInfo]
    
    inline def getCocoaPodsInfo: typings.envinfo.envinfoStrings.getCocoaPodsInfo = "getCocoaPodsInfo".asInstanceOf[typings.envinfo.envinfoStrings.getCocoaPodsInfo]
    
    inline def getComposerInfo: typings.envinfo.envinfoStrings.getComposerInfo = "getComposerInfo".asInstanceOf[typings.envinfo.envinfoStrings.getComposerInfo]
    
    inline def getContainerInfo: typings.envinfo.envinfoStrings.getContainerInfo = "getContainerInfo".asInstanceOf[typings.envinfo.envinfoStrings.getContainerInfo]
    
    inline def getDockerInfo: typings.envinfo.envinfoStrings.getDockerInfo = "getDockerInfo".asInstanceOf[typings.envinfo.envinfoStrings.getDockerInfo]
    
    inline def getEdgeInfo: typings.envinfo.envinfoStrings.getEdgeInfo = "getEdgeInfo".asInstanceOf[typings.envinfo.envinfoStrings.getEdgeInfo]
    
    inline def getElixirInfo: typings.envinfo.envinfoStrings.getElixirInfo = "getElixirInfo".asInstanceOf[typings.envinfo.envinfoStrings.getElixirInfo]
    
    inline def getEmacsInfo: typings.envinfo.envinfoStrings.getEmacsInfo = "getEmacsInfo".asInstanceOf[typings.envinfo.envinfoStrings.getEmacsInfo]
    
    inline def getErlangInfo: typings.envinfo.envinfoStrings.getErlangInfo = "getErlangInfo".asInstanceOf[typings.envinfo.envinfoStrings.getErlangInfo]
    
    inline def getFFmpegInfo: typings.envinfo.envinfoStrings.getFFmpegInfo = "getFFmpegInfo".asInstanceOf[typings.envinfo.envinfoStrings.getFFmpegInfo]
    
    inline def getFirefoxDeveloperEditionInfo: typings.envinfo.envinfoStrings.getFirefoxDeveloperEditionInfo = "getFirefoxDeveloperEditionInfo".asInstanceOf[typings.envinfo.envinfoStrings.getFirefoxDeveloperEditionInfo]
    
    inline def getFirefoxInfo: typings.envinfo.envinfoStrings.getFirefoxInfo = "getFirefoxInfo".asInstanceOf[typings.envinfo.envinfoStrings.getFirefoxInfo]
    
    inline def getFirefoxNightlyInfo: typings.envinfo.envinfoStrings.getFirefoxNightlyInfo = "getFirefoxNightlyInfo".asInstanceOf[typings.envinfo.envinfoStrings.getFirefoxNightlyInfo]
    
    inline def getGCCInfo: typings.envinfo.envinfoStrings.getGCCInfo = "getGCCInfo".asInstanceOf[typings.envinfo.envinfoStrings.getGCCInfo]
    
    inline def getGLibcInfo: typings.envinfo.envinfoStrings.getGLibcInfo = "getGLibcInfo".asInstanceOf[typings.envinfo.envinfoStrings.getGLibcInfo]
    
    inline def getGitInfo: typings.envinfo.envinfoStrings.getGitInfo = "getGitInfo".asInstanceOf[typings.envinfo.envinfoStrings.getGitInfo]
    
    inline def getGoInfo: typings.envinfo.envinfoStrings.getGoInfo = "getGoInfo".asInstanceOf[typings.envinfo.envinfoStrings.getGoInfo]
    
    inline def getGradleInfo: typings.envinfo.envinfoStrings.getGradleInfo = "getGradleInfo".asInstanceOf[typings.envinfo.envinfoStrings.getGradleInfo]
    
    inline def getHomebrewInfo: typings.envinfo.envinfoStrings.getHomebrewInfo = "getHomebrewInfo".asInstanceOf[typings.envinfo.envinfoStrings.getHomebrewInfo]
    
    inline def getIntelliJInfo: typings.envinfo.envinfoStrings.getIntelliJInfo = "getIntelliJInfo".asInstanceOf[typings.envinfo.envinfoStrings.getIntelliJInfo]
    
    inline def getInternetExplorerInfo: typings.envinfo.envinfoStrings.getInternetExplorerInfo = "getInternetExplorerInfo".asInstanceOf[typings.envinfo.envinfoStrings.getInternetExplorerInfo]
    
    inline def getJavaInfo: typings.envinfo.envinfoStrings.getJavaInfo = "getJavaInfo".asInstanceOf[typings.envinfo.envinfoStrings.getJavaInfo]
    
    inline def getLernaInfo: typings.envinfo.envinfoStrings.getLernaInfo = "getLernaInfo".asInstanceOf[typings.envinfo.envinfoStrings.getLernaInfo]
    
    inline def getMakeInfo: typings.envinfo.envinfoStrings.getMakeInfo = "getMakeInfo".asInstanceOf[typings.envinfo.envinfoStrings.getMakeInfo]
    
    inline def getMavenInfo: typings.envinfo.envinfoStrings.getMavenInfo = "getMavenInfo".asInstanceOf[typings.envinfo.envinfoStrings.getMavenInfo]
    
    inline def getMemoryInfo: typings.envinfo.envinfoStrings.getMemoryInfo = "getMemoryInfo".asInstanceOf[typings.envinfo.envinfoStrings.getMemoryInfo]
    
    inline def getMercurialInfo: typings.envinfo.envinfoStrings.getMercurialInfo = "getMercurialInfo".asInstanceOf[typings.envinfo.envinfoStrings.getMercurialInfo]
    
    inline def getMongoDBInfo: typings.envinfo.envinfoStrings.getMongoDBInfo = "getMongoDBInfo".asInstanceOf[typings.envinfo.envinfoStrings.getMongoDBInfo]
    
    inline def getMySQLInfo: typings.envinfo.envinfoStrings.getMySQLInfo = "getMySQLInfo".asInstanceOf[typings.envinfo.envinfoStrings.getMySQLInfo]
    
    inline def getNanoInfo: typings.envinfo.envinfoStrings.getNanoInfo = "getNanoInfo".asInstanceOf[typings.envinfo.envinfoStrings.getNanoInfo]
    
    inline def getNginxInfo: typings.envinfo.envinfoStrings.getNginxInfo = "getNginxInfo".asInstanceOf[typings.envinfo.envinfoStrings.getNginxInfo]
    
    inline def getNodeInfo: typings.envinfo.envinfoStrings.getNodeInfo = "getNodeInfo".asInstanceOf[typings.envinfo.envinfoStrings.getNodeInfo]
    
    inline def getNvimInfo: typings.envinfo.envinfoStrings.getNvimInfo = "getNvimInfo".asInstanceOf[typings.envinfo.envinfoStrings.getNvimInfo]
    
    inline def getOSInfo: typings.envinfo.envinfoStrings.getOSInfo = "getOSInfo".asInstanceOf[typings.envinfo.envinfoStrings.getOSInfo]
    
    inline def getPHPInfo: typings.envinfo.envinfoStrings.getPHPInfo = "getPHPInfo".asInstanceOf[typings.envinfo.envinfoStrings.getPHPInfo]
    
    inline def getParallelsInfo: typings.envinfo.envinfoStrings.getParallelsInfo = "getParallelsInfo".asInstanceOf[typings.envinfo.envinfoStrings.getParallelsInfo]
    
    inline def getPerlInfo: typings.envinfo.envinfoStrings.getPerlInfo = "getPerlInfo".asInstanceOf[typings.envinfo.envinfoStrings.getPerlInfo]
    
    inline def getPhpStormInfo: typings.envinfo.envinfoStrings.getPhpStormInfo = "getPhpStormInfo".asInstanceOf[typings.envinfo.envinfoStrings.getPhpStormInfo]
    
    inline def getPostgreSQLInfo: typings.envinfo.envinfoStrings.getPostgreSQLInfo = "getPostgreSQLInfo".asInstanceOf[typings.envinfo.envinfoStrings.getPostgreSQLInfo]
    
    inline def getProtocInfo: typings.envinfo.envinfoStrings.getProtocInfo = "getProtocInfo".asInstanceOf[typings.envinfo.envinfoStrings.getProtocInfo]
    
    inline def getPython3Info: typings.envinfo.envinfoStrings.getPython3Info = "getPython3Info".asInstanceOf[typings.envinfo.envinfoStrings.getPython3Info]
    
    inline def getPythonInfo: typings.envinfo.envinfoStrings.getPythonInfo = "getPythonInfo".asInstanceOf[typings.envinfo.envinfoStrings.getPythonInfo]
    
    inline def getRInfo: typings.envinfo.envinfoStrings.getRInfo = "getRInfo".asInstanceOf[typings.envinfo.envinfoStrings.getRInfo]
    
    inline def getRubyGemsInfo: typings.envinfo.envinfoStrings.getRubyGemsInfo = "getRubyGemsInfo".asInstanceOf[typings.envinfo.envinfoStrings.getRubyGemsInfo]
    
    inline def getRubyInfo: typings.envinfo.envinfoStrings.getRubyInfo = "getRubyInfo".asInstanceOf[typings.envinfo.envinfoStrings.getRubyInfo]
    
    inline def getRustInfo: typings.envinfo.envinfoStrings.getRustInfo = "getRustInfo".asInstanceOf[typings.envinfo.envinfoStrings.getRustInfo]
    
    inline def getSQLiteInfo: typings.envinfo.envinfoStrings.getSQLiteInfo = "getSQLiteInfo".asInstanceOf[typings.envinfo.envinfoStrings.getSQLiteInfo]
    
    inline def getSafariInfo: typings.envinfo.envinfoStrings.getSafariInfo = "getSafariInfo".asInstanceOf[typings.envinfo.envinfoStrings.getSafariInfo]
    
    inline def getSafariTechnologyPreviewInfo: typings.envinfo.envinfoStrings.getSafariTechnologyPreviewInfo = "getSafariTechnologyPreviewInfo".asInstanceOf[typings.envinfo.envinfoStrings.getSafariTechnologyPreviewInfo]
    
    inline def getScalaInfo: typings.envinfo.envinfoStrings.getScalaInfo = "getScalaInfo".asInstanceOf[typings.envinfo.envinfoStrings.getScalaInfo]
    
    inline def getShellInfo: typings.envinfo.envinfoStrings.getShellInfo = "getShellInfo".asInstanceOf[typings.envinfo.envinfoStrings.getShellInfo]
    
    inline def getSublimeTextInfo: typings.envinfo.envinfoStrings.getSublimeTextInfo = "getSublimeTextInfo".asInstanceOf[typings.envinfo.envinfoStrings.getSublimeTextInfo]
    
    inline def getSubversionInfo: typings.envinfo.envinfoStrings.getSubversionInfo = "getSubversionInfo".asInstanceOf[typings.envinfo.envinfoStrings.getSubversionInfo]
    
    inline def getVMwareFusionInfo: typings.envinfo.envinfoStrings.getVMwareFusionInfo = "getVMwareFusionInfo".asInstanceOf[typings.envinfo.envinfoStrings.getVMwareFusionInfo]
    
    inline def getVSCodeInfo: typings.envinfo.envinfoStrings.getVSCodeInfo = "getVSCodeInfo".asInstanceOf[typings.envinfo.envinfoStrings.getVSCodeInfo]
    
    inline def getVimInfo: typings.envinfo.envinfoStrings.getVimInfo = "getVimInfo".asInstanceOf[typings.envinfo.envinfoStrings.getVimInfo]
    
    inline def getVirtualBoxInfo: typings.envinfo.envinfoStrings.getVirtualBoxInfo = "getVirtualBoxInfo".asInstanceOf[typings.envinfo.envinfoStrings.getVirtualBoxInfo]
    
    inline def getVisualStudioInfo: typings.envinfo.envinfoStrings.getVisualStudioInfo = "getVisualStudioInfo".asInstanceOf[typings.envinfo.envinfoStrings.getVisualStudioInfo]
    
    inline def getWatchmanInfo: typings.envinfo.envinfoStrings.getWatchmanInfo = "getWatchmanInfo".asInstanceOf[typings.envinfo.envinfoStrings.getWatchmanInfo]
    
    inline def getWebStormInfo: typings.envinfo.envinfoStrings.getWebStormInfo = "getWebStormInfo".asInstanceOf[typings.envinfo.envinfoStrings.getWebStormInfo]
    
    inline def getWindowsSDKInfo: typings.envinfo.envinfoStrings.getWindowsSDKInfo = "getWindowsSDKInfo".asInstanceOf[typings.envinfo.envinfoStrings.getWindowsSDKInfo]
    
    inline def getXcodeInfo: typings.envinfo.envinfoStrings.getXcodeInfo = "getXcodeInfo".asInstanceOf[typings.envinfo.envinfoStrings.getXcodeInfo]
    
    inline def getYarnInfo: typings.envinfo.envinfoStrings.getYarnInfo = "getYarnInfo".asInstanceOf[typings.envinfo.envinfoStrings.getYarnInfo]
    
    inline def getYarnWorkspacesInfo: typings.envinfo.envinfoStrings.getYarnWorkspacesInfo = "getYarnWorkspacesInfo".asInstanceOf[typings.envinfo.envinfoStrings.getYarnWorkspacesInfo]
    
    inline def getYumInfo: typings.envinfo.envinfoStrings.getYumInfo = "getYumInfo".asInstanceOf[typings.envinfo.envinfoStrings.getYumInfo]
    
    inline def getiOSSDKInfo: typings.envinfo.envinfoStrings.getiOSSDKInfo = "getiOSSDKInfo".asInstanceOf[typings.envinfo.envinfoStrings.getiOSSDKInfo]
    
    inline def getnpmInfo: typings.envinfo.envinfoStrings.getnpmInfo = "getnpmInfo".asInstanceOf[typings.envinfo.envinfoStrings.getnpmInfo]
    
    inline def getpip2Info: typings.envinfo.envinfoStrings.getpip2Info = "getpip2Info".asInstanceOf[typings.envinfo.envinfoStrings.getpip2Info]
    
    inline def getpip3Info: typings.envinfo.envinfoStrings.getpip3Info = "getpip3Info".asInstanceOf[typings.envinfo.envinfoStrings.getpip3Info]
  }
  
  /* Inlined std.Record<envinfo.envinfo.HelperNames, (): std.Promise<string>> */
  trait Helpers_ extends StObject {
    
    def getAndroidSDKInfo(): js.Promise[String]
    @JSName("getAndroidSDKInfo")
    var getAndroidSDKInfo_Original: js.Function0[js.Promise[String]]
    
    def getAndroidStudioInfo(): js.Promise[String]
    @JSName("getAndroidStudioInfo")
    var getAndroidStudioInfo_Original: js.Function0[js.Promise[String]]
    
    def getApacheInfo(): js.Promise[String]
    @JSName("getApacheInfo")
    var getApacheInfo_Original: js.Function0[js.Promise[String]]
    
    def getAptInfo(): js.Promise[String]
    @JSName("getAptInfo")
    var getAptInfo_Original: js.Function0[js.Promise[String]]
    
    def getAtomInfo(): js.Promise[String]
    @JSName("getAtomInfo")
    var getAtomInfo_Original: js.Function0[js.Promise[String]]
    
    def getBashInfo(): js.Promise[String]
    @JSName("getBashInfo")
    var getBashInfo_Original: js.Function0[js.Promise[String]]
    
    def getBazelInfo(): js.Promise[String]
    @JSName("getBazelInfo")
    var getBazelInfo_Original: js.Function0[js.Promise[String]]
    
    def getBraveBrowserInfo(): js.Promise[String]
    @JSName("getBraveBrowserInfo")
    var getBraveBrowserInfo_Original: js.Function0[js.Promise[String]]
    
    def getCMakeInfo(): js.Promise[String]
    @JSName("getCMakeInfo")
    var getCMakeInfo_Original: js.Function0[js.Promise[String]]
    
    def getCPUInfo(): js.Promise[String]
    @JSName("getCPUInfo")
    var getCPUInfo_Original: js.Function0[js.Promise[String]]
    
    def getCargoInfo(): js.Promise[String]
    @JSName("getCargoInfo")
    var getCargoInfo_Original: js.Function0[js.Promise[String]]
    
    def getChromeCanaryInfo(): js.Promise[String]
    @JSName("getChromeCanaryInfo")
    var getChromeCanaryInfo_Original: js.Function0[js.Promise[String]]
    
    def getChromeInfo(): js.Promise[String]
    @JSName("getChromeInfo")
    var getChromeInfo_Original: js.Function0[js.Promise[String]]
    
    def getClangInfo(): js.Promise[String]
    @JSName("getClangInfo")
    var getClangInfo_Original: js.Function0[js.Promise[String]]
    
    def getCocoaPodsInfo(): js.Promise[String]
    @JSName("getCocoaPodsInfo")
    var getCocoaPodsInfo_Original: js.Function0[js.Promise[String]]
    
    def getComposerInfo(): js.Promise[String]
    @JSName("getComposerInfo")
    var getComposerInfo_Original: js.Function0[js.Promise[String]]
    
    def getContainerInfo(): js.Promise[String]
    @JSName("getContainerInfo")
    var getContainerInfo_Original: js.Function0[js.Promise[String]]
    
    def getDockerInfo(): js.Promise[String]
    @JSName("getDockerInfo")
    var getDockerInfo_Original: js.Function0[js.Promise[String]]
    
    def getEdgeInfo(): js.Promise[String]
    @JSName("getEdgeInfo")
    var getEdgeInfo_Original: js.Function0[js.Promise[String]]
    
    def getElixirInfo(): js.Promise[String]
    @JSName("getElixirInfo")
    var getElixirInfo_Original: js.Function0[js.Promise[String]]
    
    def getEmacsInfo(): js.Promise[String]
    @JSName("getEmacsInfo")
    var getEmacsInfo_Original: js.Function0[js.Promise[String]]
    
    def getErlangInfo(): js.Promise[String]
    @JSName("getErlangInfo")
    var getErlangInfo_Original: js.Function0[js.Promise[String]]
    
    def getFFmpegInfo(): js.Promise[String]
    @JSName("getFFmpegInfo")
    var getFFmpegInfo_Original: js.Function0[js.Promise[String]]
    
    def getFirefoxDeveloperEditionInfo(): js.Promise[String]
    @JSName("getFirefoxDeveloperEditionInfo")
    var getFirefoxDeveloperEditionInfo_Original: js.Function0[js.Promise[String]]
    
    def getFirefoxInfo(): js.Promise[String]
    @JSName("getFirefoxInfo")
    var getFirefoxInfo_Original: js.Function0[js.Promise[String]]
    
    def getFirefoxNightlyInfo(): js.Promise[String]
    @JSName("getFirefoxNightlyInfo")
    var getFirefoxNightlyInfo_Original: js.Function0[js.Promise[String]]
    
    def getGCCInfo(): js.Promise[String]
    @JSName("getGCCInfo")
    var getGCCInfo_Original: js.Function0[js.Promise[String]]
    
    def getGLibcInfo(): js.Promise[String]
    @JSName("getGLibcInfo")
    var getGLibcInfo_Original: js.Function0[js.Promise[String]]
    
    def getGitInfo(): js.Promise[String]
    @JSName("getGitInfo")
    var getGitInfo_Original: js.Function0[js.Promise[String]]
    
    def getGoInfo(): js.Promise[String]
    @JSName("getGoInfo")
    var getGoInfo_Original: js.Function0[js.Promise[String]]
    
    def getGradleInfo(): js.Promise[String]
    @JSName("getGradleInfo")
    var getGradleInfo_Original: js.Function0[js.Promise[String]]
    
    def getHomebrewInfo(): js.Promise[String]
    @JSName("getHomebrewInfo")
    var getHomebrewInfo_Original: js.Function0[js.Promise[String]]
    
    def getIntelliJInfo(): js.Promise[String]
    @JSName("getIntelliJInfo")
    var getIntelliJInfo_Original: js.Function0[js.Promise[String]]
    
    def getInternetExplorerInfo(): js.Promise[String]
    @JSName("getInternetExplorerInfo")
    var getInternetExplorerInfo_Original: js.Function0[js.Promise[String]]
    
    def getJavaInfo(): js.Promise[String]
    @JSName("getJavaInfo")
    var getJavaInfo_Original: js.Function0[js.Promise[String]]
    
    def getLernaInfo(): js.Promise[String]
    @JSName("getLernaInfo")
    var getLernaInfo_Original: js.Function0[js.Promise[String]]
    
    def getMakeInfo(): js.Promise[String]
    @JSName("getMakeInfo")
    var getMakeInfo_Original: js.Function0[js.Promise[String]]
    
    def getMavenInfo(): js.Promise[String]
    @JSName("getMavenInfo")
    var getMavenInfo_Original: js.Function0[js.Promise[String]]
    
    def getMemoryInfo(): js.Promise[String]
    @JSName("getMemoryInfo")
    var getMemoryInfo_Original: js.Function0[js.Promise[String]]
    
    def getMercurialInfo(): js.Promise[String]
    @JSName("getMercurialInfo")
    var getMercurialInfo_Original: js.Function0[js.Promise[String]]
    
    def getMongoDBInfo(): js.Promise[String]
    @JSName("getMongoDBInfo")
    var getMongoDBInfo_Original: js.Function0[js.Promise[String]]
    
    def getMySQLInfo(): js.Promise[String]
    @JSName("getMySQLInfo")
    var getMySQLInfo_Original: js.Function0[js.Promise[String]]
    
    def getNanoInfo(): js.Promise[String]
    @JSName("getNanoInfo")
    var getNanoInfo_Original: js.Function0[js.Promise[String]]
    
    def getNginxInfo(): js.Promise[String]
    @JSName("getNginxInfo")
    var getNginxInfo_Original: js.Function0[js.Promise[String]]
    
    def getNodeInfo(): js.Promise[String]
    @JSName("getNodeInfo")
    var getNodeInfo_Original: js.Function0[js.Promise[String]]
    
    def getNvimInfo(): js.Promise[String]
    @JSName("getNvimInfo")
    var getNvimInfo_Original: js.Function0[js.Promise[String]]
    
    def getOSInfo(): js.Promise[String]
    @JSName("getOSInfo")
    var getOSInfo_Original: js.Function0[js.Promise[String]]
    
    def getPHPInfo(): js.Promise[String]
    @JSName("getPHPInfo")
    var getPHPInfo_Original: js.Function0[js.Promise[String]]
    
    def getParallelsInfo(): js.Promise[String]
    @JSName("getParallelsInfo")
    var getParallelsInfo_Original: js.Function0[js.Promise[String]]
    
    def getPerlInfo(): js.Promise[String]
    @JSName("getPerlInfo")
    var getPerlInfo_Original: js.Function0[js.Promise[String]]
    
    def getPhpStormInfo(): js.Promise[String]
    @JSName("getPhpStormInfo")
    var getPhpStormInfo_Original: js.Function0[js.Promise[String]]
    
    def getPostgreSQLInfo(): js.Promise[String]
    @JSName("getPostgreSQLInfo")
    var getPostgreSQLInfo_Original: js.Function0[js.Promise[String]]
    
    def getProtocInfo(): js.Promise[String]
    @JSName("getProtocInfo")
    var getProtocInfo_Original: js.Function0[js.Promise[String]]
    
    def getPython3Info(): js.Promise[String]
    @JSName("getPython3Info")
    var getPython3Info_Original: js.Function0[js.Promise[String]]
    
    def getPythonInfo(): js.Promise[String]
    @JSName("getPythonInfo")
    var getPythonInfo_Original: js.Function0[js.Promise[String]]
    
    def getRInfo(): js.Promise[String]
    @JSName("getRInfo")
    var getRInfo_Original: js.Function0[js.Promise[String]]
    
    def getRubyGemsInfo(): js.Promise[String]
    @JSName("getRubyGemsInfo")
    var getRubyGemsInfo_Original: js.Function0[js.Promise[String]]
    
    def getRubyInfo(): js.Promise[String]
    @JSName("getRubyInfo")
    var getRubyInfo_Original: js.Function0[js.Promise[String]]
    
    def getRustInfo(): js.Promise[String]
    @JSName("getRustInfo")
    var getRustInfo_Original: js.Function0[js.Promise[String]]
    
    def getSQLiteInfo(): js.Promise[String]
    @JSName("getSQLiteInfo")
    var getSQLiteInfo_Original: js.Function0[js.Promise[String]]
    
    def getSafariInfo(): js.Promise[String]
    @JSName("getSafariInfo")
    var getSafariInfo_Original: js.Function0[js.Promise[String]]
    
    def getSafariTechnologyPreviewInfo(): js.Promise[String]
    @JSName("getSafariTechnologyPreviewInfo")
    var getSafariTechnologyPreviewInfo_Original: js.Function0[js.Promise[String]]
    
    def getScalaInfo(): js.Promise[String]
    @JSName("getScalaInfo")
    var getScalaInfo_Original: js.Function0[js.Promise[String]]
    
    def getShellInfo(): js.Promise[String]
    @JSName("getShellInfo")
    var getShellInfo_Original: js.Function0[js.Promise[String]]
    
    def getSublimeTextInfo(): js.Promise[String]
    @JSName("getSublimeTextInfo")
    var getSublimeTextInfo_Original: js.Function0[js.Promise[String]]
    
    def getSubversionInfo(): js.Promise[String]
    @JSName("getSubversionInfo")
    var getSubversionInfo_Original: js.Function0[js.Promise[String]]
    
    def getVMwareFusionInfo(): js.Promise[String]
    @JSName("getVMwareFusionInfo")
    var getVMwareFusionInfo_Original: js.Function0[js.Promise[String]]
    
    def getVSCodeInfo(): js.Promise[String]
    @JSName("getVSCodeInfo")
    var getVSCodeInfo_Original: js.Function0[js.Promise[String]]
    
    def getVimInfo(): js.Promise[String]
    @JSName("getVimInfo")
    var getVimInfo_Original: js.Function0[js.Promise[String]]
    
    def getVirtualBoxInfo(): js.Promise[String]
    @JSName("getVirtualBoxInfo")
    var getVirtualBoxInfo_Original: js.Function0[js.Promise[String]]
    
    def getVisualStudioInfo(): js.Promise[String]
    @JSName("getVisualStudioInfo")
    var getVisualStudioInfo_Original: js.Function0[js.Promise[String]]
    
    def getWatchmanInfo(): js.Promise[String]
    @JSName("getWatchmanInfo")
    var getWatchmanInfo_Original: js.Function0[js.Promise[String]]
    
    def getWebStormInfo(): js.Promise[String]
    @JSName("getWebStormInfo")
    var getWebStormInfo_Original: js.Function0[js.Promise[String]]
    
    def getWindowsSDKInfo(): js.Promise[String]
    @JSName("getWindowsSDKInfo")
    var getWindowsSDKInfo_Original: js.Function0[js.Promise[String]]
    
    def getXcodeInfo(): js.Promise[String]
    @JSName("getXcodeInfo")
    var getXcodeInfo_Original: js.Function0[js.Promise[String]]
    
    def getYarnInfo(): js.Promise[String]
    @JSName("getYarnInfo")
    var getYarnInfo_Original: js.Function0[js.Promise[String]]
    
    def getYarnWorkspacesInfo(): js.Promise[String]
    @JSName("getYarnWorkspacesInfo")
    var getYarnWorkspacesInfo_Original: js.Function0[js.Promise[String]]
    
    def getYumInfo(): js.Promise[String]
    @JSName("getYumInfo")
    var getYumInfo_Original: js.Function0[js.Promise[String]]
    
    def getiOSSDKInfo(): js.Promise[String]
    @JSName("getiOSSDKInfo")
    var getiOSSDKInfo_Original: js.Function0[js.Promise[String]]
    
    def getnpmInfo(): js.Promise[String]
    @JSName("getnpmInfo")
    var getnpmInfo_Original: js.Function0[js.Promise[String]]
    
    def getpip2Info(): js.Promise[String]
    @JSName("getpip2Info")
    var getpip2Info_Original: js.Function0[js.Promise[String]]
    
    def getpip3Info(): js.Promise[String]
    @JSName("getpip3Info")
    var getpip3Info_Original: js.Function0[js.Promise[String]]
  }
  object Helpers_ {
    
    inline def apply(
      getAndroidSDKInfo: () => js.Promise[String],
      getAndroidStudioInfo: () => js.Promise[String],
      getApacheInfo: () => js.Promise[String],
      getAptInfo: () => js.Promise[String],
      getAtomInfo: () => js.Promise[String],
      getBashInfo: () => js.Promise[String],
      getBazelInfo: () => js.Promise[String],
      getBraveBrowserInfo: () => js.Promise[String],
      getCMakeInfo: () => js.Promise[String],
      getCPUInfo: () => js.Promise[String],
      getCargoInfo: () => js.Promise[String],
      getChromeCanaryInfo: () => js.Promise[String],
      getChromeInfo: () => js.Promise[String],
      getClangInfo: () => js.Promise[String],
      getCocoaPodsInfo: () => js.Promise[String],
      getComposerInfo: () => js.Promise[String],
      getContainerInfo: () => js.Promise[String],
      getDockerInfo: () => js.Promise[String],
      getEdgeInfo: () => js.Promise[String],
      getElixirInfo: () => js.Promise[String],
      getEmacsInfo: () => js.Promise[String],
      getErlangInfo: () => js.Promise[String],
      getFFmpegInfo: () => js.Promise[String],
      getFirefoxDeveloperEditionInfo: () => js.Promise[String],
      getFirefoxInfo: () => js.Promise[String],
      getFirefoxNightlyInfo: () => js.Promise[String],
      getGCCInfo: () => js.Promise[String],
      getGLibcInfo: () => js.Promise[String],
      getGitInfo: () => js.Promise[String],
      getGoInfo: () => js.Promise[String],
      getGradleInfo: () => js.Promise[String],
      getHomebrewInfo: () => js.Promise[String],
      getIntelliJInfo: () => js.Promise[String],
      getInternetExplorerInfo: () => js.Promise[String],
      getJavaInfo: () => js.Promise[String],
      getLernaInfo: () => js.Promise[String],
      getMakeInfo: () => js.Promise[String],
      getMavenInfo: () => js.Promise[String],
      getMemoryInfo: () => js.Promise[String],
      getMercurialInfo: () => js.Promise[String],
      getMongoDBInfo: () => js.Promise[String],
      getMySQLInfo: () => js.Promise[String],
      getNanoInfo: () => js.Promise[String],
      getNginxInfo: () => js.Promise[String],
      getNodeInfo: () => js.Promise[String],
      getNvimInfo: () => js.Promise[String],
      getOSInfo: () => js.Promise[String],
      getPHPInfo: () => js.Promise[String],
      getParallelsInfo: () => js.Promise[String],
      getPerlInfo: () => js.Promise[String],
      getPhpStormInfo: () => js.Promise[String],
      getPostgreSQLInfo: () => js.Promise[String],
      getProtocInfo: () => js.Promise[String],
      getPython3Info: () => js.Promise[String],
      getPythonInfo: () => js.Promise[String],
      getRInfo: () => js.Promise[String],
      getRubyGemsInfo: () => js.Promise[String],
      getRubyInfo: () => js.Promise[String],
      getRustInfo: () => js.Promise[String],
      getSQLiteInfo: () => js.Promise[String],
      getSafariInfo: () => js.Promise[String],
      getSafariTechnologyPreviewInfo: () => js.Promise[String],
      getScalaInfo: () => js.Promise[String],
      getShellInfo: () => js.Promise[String],
      getSublimeTextInfo: () => js.Promise[String],
      getSubversionInfo: () => js.Promise[String],
      getVMwareFusionInfo: () => js.Promise[String],
      getVSCodeInfo: () => js.Promise[String],
      getVimInfo: () => js.Promise[String],
      getVirtualBoxInfo: () => js.Promise[String],
      getVisualStudioInfo: () => js.Promise[String],
      getWatchmanInfo: () => js.Promise[String],
      getWebStormInfo: () => js.Promise[String],
      getWindowsSDKInfo: () => js.Promise[String],
      getXcodeInfo: () => js.Promise[String],
      getYarnInfo: () => js.Promise[String],
      getYarnWorkspacesInfo: () => js.Promise[String],
      getYumInfo: () => js.Promise[String],
      getiOSSDKInfo: () => js.Promise[String],
      getnpmInfo: () => js.Promise[String],
      getpip2Info: () => js.Promise[String],
      getpip3Info: () => js.Promise[String]
    ): Helpers_ = {
      val __obj = js.Dynamic.literal(getAndroidSDKInfo = js.Any.fromFunction0(getAndroidSDKInfo), getAndroidStudioInfo = js.Any.fromFunction0(getAndroidStudioInfo), getApacheInfo = js.Any.fromFunction0(getApacheInfo), getAptInfo = js.Any.fromFunction0(getAptInfo), getAtomInfo = js.Any.fromFunction0(getAtomInfo), getBashInfo = js.Any.fromFunction0(getBashInfo), getBazelInfo = js.Any.fromFunction0(getBazelInfo), getBraveBrowserInfo = js.Any.fromFunction0(getBraveBrowserInfo), getCMakeInfo = js.Any.fromFunction0(getCMakeInfo), getCPUInfo = js.Any.fromFunction0(getCPUInfo), getCargoInfo = js.Any.fromFunction0(getCargoInfo), getChromeCanaryInfo = js.Any.fromFunction0(getChromeCanaryInfo), getChromeInfo = js.Any.fromFunction0(getChromeInfo), getClangInfo = js.Any.fromFunction0(getClangInfo), getCocoaPodsInfo = js.Any.fromFunction0(getCocoaPodsInfo), getComposerInfo = js.Any.fromFunction0(getComposerInfo), getContainerInfo = js.Any.fromFunction0(getContainerInfo), getDockerInfo = js.Any.fromFunction0(getDockerInfo), getEdgeInfo = js.Any.fromFunction0(getEdgeInfo), getElixirInfo = js.Any.fromFunction0(getElixirInfo), getEmacsInfo = js.Any.fromFunction0(getEmacsInfo), getErlangInfo = js.Any.fromFunction0(getErlangInfo), getFFmpegInfo = js.Any.fromFunction0(getFFmpegInfo), getFirefoxDeveloperEditionInfo = js.Any.fromFunction0(getFirefoxDeveloperEditionInfo), getFirefoxInfo = js.Any.fromFunction0(getFirefoxInfo), getFirefoxNightlyInfo = js.Any.fromFunction0(getFirefoxNightlyInfo), getGCCInfo = js.Any.fromFunction0(getGCCInfo), getGLibcInfo = js.Any.fromFunction0(getGLibcInfo), getGitInfo = js.Any.fromFunction0(getGitInfo), getGoInfo = js.Any.fromFunction0(getGoInfo), getGradleInfo = js.Any.fromFunction0(getGradleInfo), getHomebrewInfo = js.Any.fromFunction0(getHomebrewInfo), getIntelliJInfo = js.Any.fromFunction0(getIntelliJInfo), getInternetExplorerInfo = js.Any.fromFunction0(getInternetExplorerInfo), getJavaInfo = js.Any.fromFunction0(getJavaInfo), getLernaInfo = js.Any.fromFunction0(getLernaInfo), getMakeInfo = js.Any.fromFunction0(getMakeInfo), getMavenInfo = js.Any.fromFunction0(getMavenInfo), getMemoryInfo = js.Any.fromFunction0(getMemoryInfo), getMercurialInfo = js.Any.fromFunction0(getMercurialInfo), getMongoDBInfo = js.Any.fromFunction0(getMongoDBInfo), getMySQLInfo = js.Any.fromFunction0(getMySQLInfo), getNanoInfo = js.Any.fromFunction0(getNanoInfo), getNginxInfo = js.Any.fromFunction0(getNginxInfo), getNodeInfo = js.Any.fromFunction0(getNodeInfo), getNvimInfo = js.Any.fromFunction0(getNvimInfo), getOSInfo = js.Any.fromFunction0(getOSInfo), getPHPInfo = js.Any.fromFunction0(getPHPInfo), getParallelsInfo = js.Any.fromFunction0(getParallelsInfo), getPerlInfo = js.Any.fromFunction0(getPerlInfo), getPhpStormInfo = js.Any.fromFunction0(getPhpStormInfo), getPostgreSQLInfo = js.Any.fromFunction0(getPostgreSQLInfo), getProtocInfo = js.Any.fromFunction0(getProtocInfo), getPython3Info = js.Any.fromFunction0(getPython3Info), getPythonInfo = js.Any.fromFunction0(getPythonInfo), getRInfo = js.Any.fromFunction0(getRInfo), getRubyGemsInfo = js.Any.fromFunction0(getRubyGemsInfo), getRubyInfo = js.Any.fromFunction0(getRubyInfo), getRustInfo = js.Any.fromFunction0(getRustInfo), getSQLiteInfo = js.Any.fromFunction0(getSQLiteInfo), getSafariInfo = js.Any.fromFunction0(getSafariInfo), getSafariTechnologyPreviewInfo = js.Any.fromFunction0(getSafariTechnologyPreviewInfo), getScalaInfo = js.Any.fromFunction0(getScalaInfo), getShellInfo = js.Any.fromFunction0(getShellInfo), getSublimeTextInfo = js.Any.fromFunction0(getSublimeTextInfo), getSubversionInfo = js.Any.fromFunction0(getSubversionInfo), getVMwareFusionInfo = js.Any.fromFunction0(getVMwareFusionInfo), getVSCodeInfo = js.Any.fromFunction0(getVSCodeInfo), getVimInfo = js.Any.fromFunction0(getVimInfo), getVirtualBoxInfo = js.Any.fromFunction0(getVirtualBoxInfo), getVisualStudioInfo = js.Any.fromFunction0(getVisualStudioInfo), getWatchmanInfo = js.Any.fromFunction0(getWatchmanInfo), getWebStormInfo = js.Any.fromFunction0(getWebStormInfo), getWindowsSDKInfo = js.Any.fromFunction0(getWindowsSDKInfo), getXcodeInfo = js.Any.fromFunction0(getXcodeInfo), getYarnInfo = js.Any.fromFunction0(getYarnInfo), getYarnWorkspacesInfo = js.Any.fromFunction0(getYarnWorkspacesInfo), getYumInfo = js.Any.fromFunction0(getYumInfo), getiOSSDKInfo = js.Any.fromFunction0(getiOSSDKInfo), getnpmInfo = js.Any.fromFunction0(getnpmInfo), getpip2Info = js.Any.fromFunction0(getpip2Info), getpip3Info = js.Any.fromFunction0(getpip3Info))
      __obj.asInstanceOf[Helpers_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Helpers_] (val x: Self) extends AnyVal {
      
      inline def setGetAndroidSDKInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getAndroidSDKInfo", js.Any.fromFunction0(value))
      
      inline def setGetAndroidStudioInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getAndroidStudioInfo", js.Any.fromFunction0(value))
      
      inline def setGetApacheInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getApacheInfo", js.Any.fromFunction0(value))
      
      inline def setGetAptInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getAptInfo", js.Any.fromFunction0(value))
      
      inline def setGetAtomInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getAtomInfo", js.Any.fromFunction0(value))
      
      inline def setGetBashInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getBashInfo", js.Any.fromFunction0(value))
      
      inline def setGetBazelInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getBazelInfo", js.Any.fromFunction0(value))
      
      inline def setGetBraveBrowserInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getBraveBrowserInfo", js.Any.fromFunction0(value))
      
      inline def setGetCMakeInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getCMakeInfo", js.Any.fromFunction0(value))
      
      inline def setGetCPUInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getCPUInfo", js.Any.fromFunction0(value))
      
      inline def setGetCargoInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getCargoInfo", js.Any.fromFunction0(value))
      
      inline def setGetChromeCanaryInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getChromeCanaryInfo", js.Any.fromFunction0(value))
      
      inline def setGetChromeInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getChromeInfo", js.Any.fromFunction0(value))
      
      inline def setGetClangInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getClangInfo", js.Any.fromFunction0(value))
      
      inline def setGetCocoaPodsInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getCocoaPodsInfo", js.Any.fromFunction0(value))
      
      inline def setGetComposerInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getComposerInfo", js.Any.fromFunction0(value))
      
      inline def setGetContainerInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getContainerInfo", js.Any.fromFunction0(value))
      
      inline def setGetDockerInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getDockerInfo", js.Any.fromFunction0(value))
      
      inline def setGetEdgeInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getEdgeInfo", js.Any.fromFunction0(value))
      
      inline def setGetElixirInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getElixirInfo", js.Any.fromFunction0(value))
      
      inline def setGetEmacsInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getEmacsInfo", js.Any.fromFunction0(value))
      
      inline def setGetErlangInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getErlangInfo", js.Any.fromFunction0(value))
      
      inline def setGetFFmpegInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getFFmpegInfo", js.Any.fromFunction0(value))
      
      inline def setGetFirefoxDeveloperEditionInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getFirefoxDeveloperEditionInfo", js.Any.fromFunction0(value))
      
      inline def setGetFirefoxInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getFirefoxInfo", js.Any.fromFunction0(value))
      
      inline def setGetFirefoxNightlyInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getFirefoxNightlyInfo", js.Any.fromFunction0(value))
      
      inline def setGetGCCInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getGCCInfo", js.Any.fromFunction0(value))
      
      inline def setGetGLibcInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getGLibcInfo", js.Any.fromFunction0(value))
      
      inline def setGetGitInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getGitInfo", js.Any.fromFunction0(value))
      
      inline def setGetGoInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getGoInfo", js.Any.fromFunction0(value))
      
      inline def setGetGradleInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getGradleInfo", js.Any.fromFunction0(value))
      
      inline def setGetHomebrewInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getHomebrewInfo", js.Any.fromFunction0(value))
      
      inline def setGetIntelliJInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getIntelliJInfo", js.Any.fromFunction0(value))
      
      inline def setGetInternetExplorerInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getInternetExplorerInfo", js.Any.fromFunction0(value))
      
      inline def setGetJavaInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getJavaInfo", js.Any.fromFunction0(value))
      
      inline def setGetLernaInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getLernaInfo", js.Any.fromFunction0(value))
      
      inline def setGetMakeInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getMakeInfo", js.Any.fromFunction0(value))
      
      inline def setGetMavenInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getMavenInfo", js.Any.fromFunction0(value))
      
      inline def setGetMemoryInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getMemoryInfo", js.Any.fromFunction0(value))
      
      inline def setGetMercurialInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getMercurialInfo", js.Any.fromFunction0(value))
      
      inline def setGetMongoDBInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getMongoDBInfo", js.Any.fromFunction0(value))
      
      inline def setGetMySQLInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getMySQLInfo", js.Any.fromFunction0(value))
      
      inline def setGetNanoInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getNanoInfo", js.Any.fromFunction0(value))
      
      inline def setGetNginxInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getNginxInfo", js.Any.fromFunction0(value))
      
      inline def setGetNodeInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getNodeInfo", js.Any.fromFunction0(value))
      
      inline def setGetNvimInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getNvimInfo", js.Any.fromFunction0(value))
      
      inline def setGetOSInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getOSInfo", js.Any.fromFunction0(value))
      
      inline def setGetPHPInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getPHPInfo", js.Any.fromFunction0(value))
      
      inline def setGetParallelsInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getParallelsInfo", js.Any.fromFunction0(value))
      
      inline def setGetPerlInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getPerlInfo", js.Any.fromFunction0(value))
      
      inline def setGetPhpStormInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getPhpStormInfo", js.Any.fromFunction0(value))
      
      inline def setGetPostgreSQLInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getPostgreSQLInfo", js.Any.fromFunction0(value))
      
      inline def setGetProtocInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getProtocInfo", js.Any.fromFunction0(value))
      
      inline def setGetPython3Info(value: () => js.Promise[String]): Self = StObject.set(x, "getPython3Info", js.Any.fromFunction0(value))
      
      inline def setGetPythonInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getPythonInfo", js.Any.fromFunction0(value))
      
      inline def setGetRInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getRInfo", js.Any.fromFunction0(value))
      
      inline def setGetRubyGemsInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getRubyGemsInfo", js.Any.fromFunction0(value))
      
      inline def setGetRubyInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getRubyInfo", js.Any.fromFunction0(value))
      
      inline def setGetRustInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getRustInfo", js.Any.fromFunction0(value))
      
      inline def setGetSQLiteInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getSQLiteInfo", js.Any.fromFunction0(value))
      
      inline def setGetSafariInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getSafariInfo", js.Any.fromFunction0(value))
      
      inline def setGetSafariTechnologyPreviewInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getSafariTechnologyPreviewInfo", js.Any.fromFunction0(value))
      
      inline def setGetScalaInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getScalaInfo", js.Any.fromFunction0(value))
      
      inline def setGetShellInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getShellInfo", js.Any.fromFunction0(value))
      
      inline def setGetSublimeTextInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getSublimeTextInfo", js.Any.fromFunction0(value))
      
      inline def setGetSubversionInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getSubversionInfo", js.Any.fromFunction0(value))
      
      inline def setGetVMwareFusionInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getVMwareFusionInfo", js.Any.fromFunction0(value))
      
      inline def setGetVSCodeInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getVSCodeInfo", js.Any.fromFunction0(value))
      
      inline def setGetVimInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getVimInfo", js.Any.fromFunction0(value))
      
      inline def setGetVirtualBoxInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getVirtualBoxInfo", js.Any.fromFunction0(value))
      
      inline def setGetVisualStudioInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getVisualStudioInfo", js.Any.fromFunction0(value))
      
      inline def setGetWatchmanInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getWatchmanInfo", js.Any.fromFunction0(value))
      
      inline def setGetWebStormInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getWebStormInfo", js.Any.fromFunction0(value))
      
      inline def setGetWindowsSDKInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getWindowsSDKInfo", js.Any.fromFunction0(value))
      
      inline def setGetXcodeInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getXcodeInfo", js.Any.fromFunction0(value))
      
      inline def setGetYarnInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getYarnInfo", js.Any.fromFunction0(value))
      
      inline def setGetYarnWorkspacesInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getYarnWorkspacesInfo", js.Any.fromFunction0(value))
      
      inline def setGetYumInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getYumInfo", js.Any.fromFunction0(value))
      
      inline def setGetiOSSDKInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getiOSSDKInfo", js.Any.fromFunction0(value))
      
      inline def setGetnpmInfo(value: () => js.Promise[String]): Self = StObject.set(x, "getnpmInfo", js.Any.fromFunction0(value))
      
      inline def setGetpip2Info(value: () => js.Promise[String]): Self = StObject.set(x, "getpip2Info", js.Any.fromFunction0(value))
      
      inline def setGetpip3Info(value: () => js.Promise[String]): Self = StObject.set(x, "getpip3Info", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    var console: js.UndefOr[Boolean] = js.undefined
    
    var duplicates: js.UndefOr[Boolean] = js.undefined
    
    var fullTree: js.UndefOr[Boolean] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var markdown: js.UndefOr[Boolean] = js.undefined
    
    var showNotFound: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setConsole(value: Boolean): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setDuplicates(value: Boolean): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      inline def setDuplicatesUndefined: Self = StObject.set(x, "duplicates", js.undefined)
      
      inline def setFullTree(value: Boolean): Self = StObject.set(x, "fullTree", value.asInstanceOf[js.Any])
      
      inline def setFullTreeUndefined: Self = StObject.set(x, "fullTree", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMarkdown(value: Boolean): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      inline def setMarkdownUndefined: Self = StObject.set(x, "markdown", js.undefined)
      
      inline def setShowNotFound(value: Boolean): Self = StObject.set(x, "showNotFound", value.asInstanceOf[js.Any])
      
      inline def setShowNotFoundUndefined: Self = StObject.set(x, "showNotFound", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait RunConfig
    extends StObject
       with Config {
    
    var preset: js.UndefOr[String] = js.undefined
  }
  object RunConfig {
    
    inline def apply(): RunConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunConfig] (val x: Self) extends AnyVal {
      
      inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    }
  }
}
