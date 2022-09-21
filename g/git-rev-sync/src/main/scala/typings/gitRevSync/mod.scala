package typings.gitRevSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-rev-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def branch(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("branch")().asInstanceOf[String]
  inline def branch(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("branch")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def count(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Double]
  
  inline def date(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[js.Date]
  
  inline def hasUnstagedChanges(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasUnstagedChanges")().asInstanceOf[Boolean]
  
  inline def isDirty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirty")().asInstanceOf[Boolean]
  
  inline def isTagDirty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTagDirty")().asInstanceOf[Boolean]
  
  inline def long(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("long")().asInstanceOf[String]
  inline def long(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("long")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def message(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("message")().asInstanceOf[String]
  
  inline def remoteUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("remoteUrl")().asInstanceOf[String]
  
  inline def short(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("short")().asInstanceOf[String]
  inline def short(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("short")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def short(filePath: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("short")(filePath.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def short(filePath: Unit, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("short")(filePath.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tag(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tag")().asInstanceOf[String]
  inline def tag(makeDirty: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tag")(makeDirty.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tagFirstParent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tagFirstParent")().asInstanceOf[String]
  inline def tagFirstParent(makeDirty: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tagFirstParent")(makeDirty.asInstanceOf[js.Any]).asInstanceOf[String]
}
