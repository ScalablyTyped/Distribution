package typings.editJsonFile.mod

import typings.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** JSON file editor. */
@js.native
trait JsonEditor extends js.Object {
  
  /** Empty the JSON file. */
  def empty(): JsonEditor = js.native
  def empty(cb: NoParamCallback): JsonEditor = js.native
  
  /** Get value at path. */
  def get(): js.Any = js.native
  def get(path: String): js.Any = js.native
  
  /** Read the JSON file. */
  def read(): js.Object = js.native
  def read(cb: NoParamCallback): js.Object = js.native
  
  /** Save the JSON file back to disk. */
  def save(): JsonEditor = js.native
  def save(cb: NoParamCallback): JsonEditor = js.native
  
  /** Set value at path. */
  def set(path: String, value: js.Any): JsonEditor = js.native
  
  /** Get full object. */
  def toObject(): js.Object = js.native
  
  /** Unset value at path. */
  def unset(path: String): JsonEditor = js.native
  
  /** Overwrite the JSON file. */
  def write(content: String): JsonEditor = js.native
  def write(content: String, cb: NoParamCallback): JsonEditor = js.native
}
