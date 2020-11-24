package typings.falcor.mod

import typings.falcorJsonGraph.mod.JSONGraphEnvelope
import typings.falcorJsonGraph.mod.Path
import typings.falcorJsonGraph.mod.PathSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("falcor", "DataSource")
@js.native
abstract class DataSource () extends js.Object {
  
  /**
    * Invokes a function in the DataSource's JSONGraph object.
    */
  def call(functionPath: Path): Observable[JSONGraphEnvelope] = js.native
  def call(
    functionPath: Path,
    args: js.UndefOr[scala.Nothing],
    refSuffixes: js.UndefOr[scala.Nothing],
    thisPaths: js.Array[PathSet]
  ): Observable[JSONGraphEnvelope] = js.native
  def call(functionPath: Path, args: js.UndefOr[scala.Nothing], refSuffixes: js.Array[PathSet]): Observable[JSONGraphEnvelope] = js.native
  def call(
    functionPath: Path,
    args: js.UndefOr[scala.Nothing],
    refSuffixes: js.Array[PathSet],
    thisPaths: js.Array[PathSet]
  ): Observable[JSONGraphEnvelope] = js.native
  def call(functionPath: Path, args: js.Array[_]): Observable[JSONGraphEnvelope] = js.native
  def call(
    functionPath: Path,
    args: js.Array[_],
    refSuffixes: js.UndefOr[scala.Nothing],
    thisPaths: js.Array[PathSet]
  ): Observable[JSONGraphEnvelope] = js.native
  def call(functionPath: Path, args: js.Array[_], refSuffixes: js.Array[PathSet]): Observable[JSONGraphEnvelope] = js.native
  def call(
    functionPath: Path,
    args: js.Array[_],
    refSuffixes: js.Array[PathSet],
    thisPaths: js.Array[PathSet]
  ): Observable[JSONGraphEnvelope] = js.native
  
  /**
    * The get method retrieves values from the DataSource's associated JSONGraph object.
    */
  def get(pathSets: js.Array[PathSet]): Observable[JSONGraphEnvelope] = js.native
  
  /**
    * The set method accepts values to set in the DataSource's associated JSONGraph object.
    */
  def set(jsonGraphEnvelope: JSONGraphEnvelope): Observable[JSONGraphEnvelope] = js.native
}
