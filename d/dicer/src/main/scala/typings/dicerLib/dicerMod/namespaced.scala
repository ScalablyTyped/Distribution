package typings
package dicerLib.dicerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable:unified-signatures
/**
  * A very fast streaming multipart parser for node.js.
  * Dicer is a WritableStream
  *
  * Dicer (special) events:
  * - on('finish', ()) - Emitted when all parts have been parsed and the Dicer instance has been ended.
  * - on('part', (stream: PartStream)) - Emitted when a new part has been found.
  * - on('preamble', (stream: PartStream)) - Emitted for preamble if you should happen to need it (can usually be ignored).
  * - on('trailer', (data: Buffer)) - Emitted when trailing data was found after the terminating boundary (as with the preamble, this can usually be ignored too).
  */
@JSImport("dicer", JSImport.Namespace)
@js.native
class namespaced protected () extends Dicer {
  /**
    * Creates and returns a new Dicer instance with the following valid config settings:
    *
    * @param config The configuration to use
    */
  def this(config: dicerLib.dicerMod.DicerNs.Config) = this()
}

