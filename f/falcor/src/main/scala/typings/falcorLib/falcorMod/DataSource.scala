package typings
package falcorLib.falcorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("falcor", "DataSource")
@js.native
abstract class DataSource () extends js.Object {
  /**
    * Invokes a function in the DataSource's JSONGraph object.
    */
  def call(functionPath: falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.Path): Observable[
    falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.JSONGraphEnvelope
  ] = js.native
  def call(
    functionPath: falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.Path,
    args: js.Array[_]
  ): Observable[
    falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.JSONGraphEnvelope
  ] = js.native
  def call(
    functionPath: falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.Path,
    args: js.Array[_],
    refSuffixes: js.Array[falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.PathSet]
  ): Observable[
    falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.JSONGraphEnvelope
  ] = js.native
  def call(
    functionPath: falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.Path,
    args: js.Array[_],
    refSuffixes: js.Array[falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.PathSet],
    thisPaths: js.Array[falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.PathSet]
  ): Observable[
    falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.JSONGraphEnvelope
  ] = js.native
  /**
    * The get method retrieves values from the DataSource's associated JSONGraph object.
    */
  def get(
    pathSets: js.Array[falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.PathSet]
  ): Observable[
    falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.JSONGraphEnvelope
  ] = js.native
  /**
    * The set method accepts values to set in the DataSource's associated JSONGraph object.
    */
  def set(
    jsonGraphEnvelope: falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.JSONGraphEnvelope
  ): Observable[
    falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.JSONGraphEnvelope
  ] = js.native
}

