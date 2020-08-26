package typings.enhancedResolve.mod.ResolverFactory

import typings.enhancedResolve.commonTypesMod.AbstractInputFileSystem
import typings.enhancedResolve.commonTypesMod.ResolverRequest
import typings.enhancedResolve.concordMod.Dictionary
import typings.enhancedResolve.resolverMod.^
import typings.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverOption extends js.Object {
  var alias: js.UndefOr[js.Array[AliasItem] | Dictionary[String]] = js.native
  var aliasFields: js.UndefOr[js.Array[String]] = js.native
  var cachePredicate: js.UndefOr[js.Function1[/* val */ ResolverRequest, Boolean]] = js.native
  var descriptionFiles: js.UndefOr[js.Array[String]] = js.native
  var enforceExtension: js.UndefOr[Boolean] = js.native
  var enforceModuleExtension: js.UndefOr[Boolean] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var fileSystem: js.UndefOr[AbstractInputFileSystem] = js.native
  var mainFields: js.UndefOr[js.Array[String]] = js.native
  var mainFiles: js.UndefOr[js.Array[String]] = js.native
  var moduleExtensions: js.UndefOr[js.Array[String]] = js.native
  var modules: js.UndefOr[js.Array[String]] = js.native
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
  var resolveToContext: js.UndefOr[Boolean] = js.native
  var resolver: js.UndefOr[^] = js.native
  var symlinks: js.UndefOr[js.Array[String] | Boolean] = js.native
  var unsafeCache: js.UndefOr[Boolean | Dictionary[_]] = js.native
  var useSyncFileSystemCalls: js.UndefOr[Boolean] = js.native
}

object ResolverOption {
  @scala.inline
  def apply(): ResolverOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverOption]
  }
  @scala.inline
  implicit class ResolverOptionOps[Self <: ResolverOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAliasVarargs(value: AliasItem*): Self = this.set("alias", js.Array(value :_*))
    @scala.inline
    def setAlias(value: js.Array[AliasItem] | Dictionary[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setAliasFieldsVarargs(value: String*): Self = this.set("aliasFields", js.Array(value :_*))
    @scala.inline
    def setAliasFields(value: js.Array[String]): Self = this.set("aliasFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliasFields: Self = this.set("aliasFields", js.undefined)
    @scala.inline
    def setCachePredicate(value: /* val */ ResolverRequest => Boolean): Self = this.set("cachePredicate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCachePredicate: Self = this.set("cachePredicate", js.undefined)
    @scala.inline
    def setDescriptionFilesVarargs(value: String*): Self = this.set("descriptionFiles", js.Array(value :_*))
    @scala.inline
    def setDescriptionFiles(value: js.Array[String]): Self = this.set("descriptionFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionFiles: Self = this.set("descriptionFiles", js.undefined)
    @scala.inline
    def setEnforceExtension(value: Boolean): Self = this.set("enforceExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceExtension: Self = this.set("enforceExtension", js.undefined)
    @scala.inline
    def setEnforceModuleExtension(value: Boolean): Self = this.set("enforceModuleExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceModuleExtension: Self = this.set("enforceModuleExtension", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFileSystem(value: AbstractInputFileSystem): Self = this.set("fileSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSystem: Self = this.set("fileSystem", js.undefined)
    @scala.inline
    def setMainFieldsVarargs(value: String*): Self = this.set("mainFields", js.Array(value :_*))
    @scala.inline
    def setMainFields(value: js.Array[String]): Self = this.set("mainFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainFields: Self = this.set("mainFields", js.undefined)
    @scala.inline
    def setMainFilesVarargs(value: String*): Self = this.set("mainFiles", js.Array(value :_*))
    @scala.inline
    def setMainFiles(value: js.Array[String]): Self = this.set("mainFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainFiles: Self = this.set("mainFiles", js.undefined)
    @scala.inline
    def setModuleExtensionsVarargs(value: String*): Self = this.set("moduleExtensions", js.Array(value :_*))
    @scala.inline
    def setModuleExtensions(value: js.Array[String]): Self = this.set("moduleExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleExtensions: Self = this.set("moduleExtensions", js.undefined)
    @scala.inline
    def setModulesVarargs(value: String*): Self = this.set("modules", js.Array(value :_*))
    @scala.inline
    def setModules(value: js.Array[String]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: Plugin*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[Plugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setResolveToContext(value: Boolean): Self = this.set("resolveToContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveToContext: Self = this.set("resolveToContext", js.undefined)
    @scala.inline
    def setResolver(value: ^): Self = this.set("resolver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
    @scala.inline
    def setSymlinksVarargs(value: String*): Self = this.set("symlinks", js.Array(value :_*))
    @scala.inline
    def setSymlinks(value: js.Array[String] | Boolean): Self = this.set("symlinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymlinks: Self = this.set("symlinks", js.undefined)
    @scala.inline
    def setUnsafeCache(value: Boolean | Dictionary[_]): Self = this.set("unsafeCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafeCache: Self = this.set("unsafeCache", js.undefined)
    @scala.inline
    def setUseSyncFileSystemCalls(value: Boolean): Self = this.set("useSyncFileSystemCalls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSyncFileSystemCalls: Self = this.set("useSyncFileSystemCalls", js.undefined)
  }
  
}

