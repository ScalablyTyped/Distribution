package typings.fsPromise.mod

import typings.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.node.eventsMod.global.NodeJS.EventEmitter because Already inherited
- typings.node.eventsMod.EventEmitter because Already inherited
- typings.node.eventsMod.global.NodeJS.EventEmitter because Already inherited
- typings.node.childProcessMod.StdioNull because Already inherited
- typings.node.streamMod.internal because Already inherited
- typings.node.NodeJS.ReadableStream because Already inherited
- typings.node.streamMod.Stream because Already inherited
- typings.node.streamMod.Readable because Already inherited
- typings.node.fsMod.ReadStream because Already inherited
- typings.fsExtra.mod.ReadStream because Inheritance from two classes. Inlined  */ @JSImport("fs-promise", "ReadStream")
@js.native
class ReadStream ()
  extends typings.mz.fsMod.ReadStream {
  def this(opts: ReadableOptions) = this()
}
