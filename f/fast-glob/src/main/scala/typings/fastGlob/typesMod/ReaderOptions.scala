package typings.fastGlob.typesMod

import typings.nodelibFsWalk.PartialFileSystemAdapter
import typings.nodelibFsWalk.typesMod.Errno
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nodelib/fs.walk.@nodelib/fs.walk.Options & {transform (entry : fast-glob.fast-glob/out/types.Entry): fast-glob.fast-glob/out/types.EntryItem,   deepFilter  :fast-glob.fast-glob/out/types.DeepFilterFunction,   entryFilter  :fast-glob.fast-glob/out/types.EntryFilterFunction,   errorFilter  :fast-glob.fast-glob/out/types.ErrorFilterFunction,   fs  :fast-glob.fast-glob/out/types.FileSystemAdapter,   stats  :boolean} */
@js.native
trait ReaderOptions extends js.Object {
  var basePath: js.UndefOr[String] = js.native
  var concurrency: js.UndefOr[Double] = js.native
  @JSName("deepFilter")
  var deepFilter_Original: js.UndefOr[typings.nodelibFsWalk.settingsMod.DeepFilterFunction with DeepFilterFunction] = js.native
  @JSName("entryFilter")
  var entryFilter_Original: js.UndefOr[typings.nodelibFsWalk.settingsMod.EntryFilterFunction with EntryFilterFunction] = js.native
  @JSName("errorFilter")
  var errorFilter_Original: js.UndefOr[typings.nodelibFsWalk.settingsMod.ErrorFilterFunction with ErrorFilterFunction] = js.native
  var followSymbolicLinks: js.UndefOr[Boolean] = js.native
  var fs: js.UndefOr[PartialFileSystemAdapter with FileSystemAdapter] = js.native
  var pathSegmentSeparator: js.UndefOr[String] = js.native
  var stats: js.UndefOr[Boolean] = js.native
  var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.native
  def deepFilter(value: typings.nodelibFsWalk.typesMod.Entry): Boolean = js.native
  def entryFilter(value: typings.nodelibFsWalk.typesMod.Entry): Boolean = js.native
  def errorFilter(value: Errno): Boolean = js.native
  def transform(entry: Entry): EntryItem = js.native
}

