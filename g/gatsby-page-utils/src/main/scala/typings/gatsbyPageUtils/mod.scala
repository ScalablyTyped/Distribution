package typings.gatsbyPageUtils

import typings.gatsbyPageUtils.applyTrailingSlashOptionMod.TrailingSlash
import typings.gatsbyPageUtils.ignorePathMod.IPathIgnoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gatsby-page-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyTrailingSlashOption(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTrailingSlashOption")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def applyTrailingSlashOption(input: String, option: TrailingSlash): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTrailingSlashOption")(input.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createPath(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def createPath(filePath: String, withTrailingSlash: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(filePath.asInstanceOf[js.Any], withTrailingSlash.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def createPath(filePath: String, withTrailingSlash: Boolean, usePathBase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(filePath.asInstanceOf[js.Any], withTrailingSlash.asInstanceOf[js.Any], usePathBase.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def createPath(filePath: String, withTrailingSlash: Unit, usePathBase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(filePath.asInstanceOf[js.Any], withTrailingSlash.asInstanceOf[js.Any], usePathBase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ignorePath(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ignorePath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def ignorePath(path: String, ignore: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ignorePath")(path.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ignorePath(path: String, ignore: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ignorePath")(path.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ignorePath(path: String, ignore: IPathIgnoreOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ignorePath")(path.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validatePath(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def watchDirectory(
    path: String,
    glob: String,
    onNewFile: js.Function1[/* path */ String, Unit],
    onRemovedFile: js.Function1[/* path */ String, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("watchDirectory")(path.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], onNewFile.asInstanceOf[js.Any], onRemovedFile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def watchDirectory(
    path: String,
    glob: js.Array[String],
    onNewFile: js.Function1[/* path */ String, Unit],
    onRemovedFile: js.Function1[/* path */ String, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("watchDirectory")(path.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], onNewFile.asInstanceOf[js.Any], onRemovedFile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
