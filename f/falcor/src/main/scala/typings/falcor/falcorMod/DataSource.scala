package typings.falcor.falcorMod

import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.JSONGraphEnvelope
import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.Path
import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.PathSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("falcor", "DataSource")
@js.native
abstract class DataSource () extends js.Object {
  /**
    * Invokes a function in the DataSource's JSONGraph object.
    */
  def call(functionPath: Path): Observable[JSONGraphEnvelope] = js.native
  def call(functionPath: Path, args: js.Array[_]): Observable[JSONGraphEnvelope] = js.native
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

