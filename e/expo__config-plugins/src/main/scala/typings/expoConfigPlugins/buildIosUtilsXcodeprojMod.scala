package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.AddFileToProject
import typings.expoConfigPlugins.anon.ConfigurationListId
import typings.expoConfigPlugins.anon.Filepath
import typings.expoConfigPlugins.anon.Framework
import typings.expoConfigPlugins.anon.GroupName
import typings.expoConfigPlugins.anon.ProjectName
import typings.expoConfigPlugins.anon.Target
import typings.expoConfigTypes.mod.ExpoConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosUtilsXcodeprojMod {
  
  @JSImport("@expo/config-plugins/build/ios/utils/Xcodeproj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBuildSourceFileToGroup(hasFilepathGroupNameProjectVerboseTargetUuid: Filepath): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addBuildSourceFileToGroup")(hasFilepathGroupNameProjectVerboseTargetUuid.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def addFileToGroupAndLink(hasFilepathGroupNameProjectVerboseAddFileToProjectTargetUuid: AddFileToProject): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addFileToGroupAndLink")(hasFilepathGroupNameProjectVerboseAddFileToProjectTargetUuid.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def addFramework(hasProjectProjectNameFramework: Framework): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addFramework")(hasProjectProjectNameFramework.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def addResourceFileToGroup(hasFilepathGroupNameIsBuildFileProjectVerboseTargetUuid: GroupName): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addResourceFileToGroup")(hasFilepathGroupNameIsBuildFileProjectVerboseTargetUuid.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ensureGroupRecursively(
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any,
    filepath: String
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXGroup */ Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureGroupRecursively")(project.asInstanceOf[js.Any], filepath.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXGroup */ Any) | Null]
  
  inline def getApplicationNativeTarget(hasProjectProjectName: ProjectName): Target = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationNativeTarget")(hasProjectProjectName.asInstanceOf[js.Any]).asInstanceOf[Target]
  
  inline def getBuildConfigurationForListIdAndName(
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any,
    hasConfigurationListIdBuildConfiguration: ConfigurationListId
  ): ConfigurationSectionEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("getBuildConfigurationForListIdAndName")(project.asInstanceOf[js.Any], hasConfigurationListIdBuildConfiguration.asInstanceOf[js.Any])).asInstanceOf[ConfigurationSectionEntry]
  
  inline def getBuildConfigurationsForListId(
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any,
    configurationListId: String
  ): js.Array[ConfigurationSectionEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBuildConfigurationsForListId")(project.asInstanceOf[js.Any], configurationListId.asInstanceOf[js.Any])).asInstanceOf[js.Array[ConfigurationSectionEntry]]
  
  inline def getHackyProjectName(projectRoot: String, config: ExpoConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHackyProjectName")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPbxproj(projectRoot: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPbxproj")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getProductName(
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProductName")(project.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getProjectName(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectName")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getProjectSection(
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): (Record[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.PBXProject */ Any
  ]) & (Record[String, String]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectSection")(project.asInstanceOf[js.Any]).asInstanceOf[(Record[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.PBXProject */ Any
  ]) & (Record[String, String])]
  
  inline def getXCConfigurationListEntries(
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): js.Array[ConfigurationListEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getXCConfigurationListEntries")(project.asInstanceOf[js.Any]).asInstanceOf[js.Array[ConfigurationListEntry]]
  
  inline def isBuildConfig(hasSectionItem: ConfigurationSectionEntry): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuildConfig")(hasSectionItem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNotComment(
    hasKey: ConfigurationListEntry | ConfigurationSectionEntry | NativeTargetSectionEntry | ProjectSectionEntry
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotComment")(hasKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNotTestHost(hasSectionItem: ConfigurationSectionEntry): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotTestHost")(hasSectionItem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolvePathOrProject(projectRootOrProject: String): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePathOrProject")(projectRootOrProject.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any) | Null]
  inline def resolvePathOrProject(
    projectRootOrProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePathOrProject")(projectRootOrProject.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any) | Null]
  
  inline def sanitizedName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizedName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unquote(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unquote")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ConfigurationListEntry = js.Tuple2[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XCConfigurationList */ Any
  ]
  
  type ConfigurationLists = Record[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XCConfigurationList */ Any
  ]
  
  type ConfigurationSectionEntry = js.Tuple2[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XCBuildConfiguration */ Any
  ]
  
  type NativeTargetSection = Record[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXNativeTarget */ Any
  ]
  
  type NativeTargetSectionEntry = js.Tuple2[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXNativeTarget */ Any
  ]
  
  type ProjectSectionEntry = js.Tuple2[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXProject */ Any
  ]
}
