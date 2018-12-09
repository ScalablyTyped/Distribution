package typings
package fastDashGlobLib.fastDashGlobMod.FastGlobNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApi extends js.Object {
  def apply[T](patterns: fastDashGlobLib.outTypesPatternsMod.Pattern): js.Promise[js.Array[T]] = js.native
  def apply[T](
    patterns: fastDashGlobLib.outTypesPatternsMod.Pattern,
    options: fastDashGlobLib.outManagersOptionsMod.IPartialOptions[T]
  ): js.Promise[js.Array[T]] = js.native
  def apply[T](patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern]): js.Promise[js.Array[T]] = js.native
  def apply[T](
    patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    options: fastDashGlobLib.outManagersOptionsMod.IPartialOptions[T]
  ): js.Promise[js.Array[T]] = js.native
  def async[T](patterns: fastDashGlobLib.outTypesPatternsMod.Pattern): js.Promise[js.Array[T]] = js.native
  def async[T](
    patterns: fastDashGlobLib.outTypesPatternsMod.Pattern,
    options: fastDashGlobLib.outManagersOptionsMod.IPartialOptions[T]
  ): js.Promise[js.Array[T]] = js.native
  def async[T](patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern]): js.Promise[js.Array[T]] = js.native
  def async[T](
    patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    options: fastDashGlobLib.outManagersOptionsMod.IPartialOptions[T]
  ): js.Promise[js.Array[T]] = js.native
  def generateTasks(patterns: fastDashGlobLib.outTypesPatternsMod.Pattern): js.Array[Task] = js.native
  def generateTasks(
    patterns: fastDashGlobLib.outTypesPatternsMod.Pattern,
    options: fastDashGlobLib.outManagersOptionsMod.IPartialOptions[fastDashGlobLib.outTypesEntriesMod.EntryItem]
  ): js.Array[Task] = js.native
  def generateTasks(patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern]): js.Array[Task] = js.native
  def generateTasks(
    patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    options: fastDashGlobLib.outManagersOptionsMod.IPartialOptions[fastDashGlobLib.outTypesEntriesMod.EntryItem]
  ): js.Array[Task] = js.native
  def stream(patterns: fastDashGlobLib.outTypesPatternsMod.Pattern): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(
    patterns: fastDashGlobLib.outTypesPatternsMod.Pattern,
    options: fastDashGlobLib.outManagersOptionsMod.IPartialOptions[fastDashGlobLib.outTypesEntriesMod.EntryItem]
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern]): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(
    patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    options: fastDashGlobLib.outManagersOptionsMod.IPartialOptions[fastDashGlobLib.outTypesEntriesMod.EntryItem]
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  def sync[T](patterns: fastDashGlobLib.outTypesPatternsMod.Pattern): js.Array[T] = js.native
  def sync[T](
    patterns: fastDashGlobLib.outTypesPatternsMod.Pattern,
    options: fastDashGlobLib.outManagersOptionsMod.IPartialOptions[T]
  ): js.Array[T] = js.native
  def sync[T](patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern]): js.Array[T] = js.native
  def sync[T](
    patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    options: fastDashGlobLib.outManagersOptionsMod.IPartialOptions[T]
  ): js.Array[T] = js.native
}

