package typings.gitRevSync

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-rev-sync", "branch")
  @js.native
  def branch(): String = js.native
  @JSImport("git-rev-sync", "branch")
  @js.native
  def branch(filePath: String): String = js.native
  
  @JSImport("git-rev-sync", "count")
  @js.native
  def count(): Double = js.native
  
  @JSImport("git-rev-sync", "date")
  @js.native
  def date(): Date = js.native
  
  @JSImport("git-rev-sync", "hasUnstagedChanges")
  @js.native
  def hasUnstagedChanges(): Boolean = js.native
  
  @JSImport("git-rev-sync", "isDirty")
  @js.native
  def isDirty(): Boolean = js.native
  
  @JSImport("git-rev-sync", "isTagDirty")
  @js.native
  def isTagDirty(): Boolean = js.native
  
  @JSImport("git-rev-sync", "long")
  @js.native
  def long(): String = js.native
  @JSImport("git-rev-sync", "long")
  @js.native
  def long(filePath: String): String = js.native
  
  @JSImport("git-rev-sync", "message")
  @js.native
  def message(): String = js.native
  
  @JSImport("git-rev-sync", "remoteUrl")
  @js.native
  def remoteUrl(): String = js.native
  
  @JSImport("git-rev-sync", "short")
  @js.native
  def short(): String = js.native
  @JSImport("git-rev-sync", "short")
  @js.native
  def short(filePath: js.UndefOr[scala.Nothing], length: Double): String = js.native
  @JSImport("git-rev-sync", "short")
  @js.native
  def short(filePath: String): String = js.native
  @JSImport("git-rev-sync", "short")
  @js.native
  def short(filePath: String, length: Double): String = js.native
  
  @JSImport("git-rev-sync", "tag")
  @js.native
  def tag(): String = js.native
  @JSImport("git-rev-sync", "tag")
  @js.native
  def tag(makeDirty: Boolean): String = js.native
  
  @JSImport("git-rev-sync", "tagFirstParent")
  @js.native
  def tagFirstParent(): String = js.native
  @JSImport("git-rev-sync", "tagFirstParent")
  @js.native
  def tagFirstParent(makeDirty: Boolean): String = js.native
}
