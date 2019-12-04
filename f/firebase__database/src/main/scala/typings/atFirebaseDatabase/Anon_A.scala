package typings.atFirebaseDatabase

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.atFirebaseDatabase.distSrcApiReferenceMod.Reference
import typings.atFirebaseDatabase.distSrcCoreRepoMod.Repo
import typings.atFirebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_A extends js.Object {
  var DataSnapshot: Instantiable3[
    /* node_ */ Node, 
    /* ref_ */ Reference, 
    /* index_ */ Index, 
    typings.atFirebaseDatabase.distSrcApiDataSnapshotMod.DataSnapshot
  ] = js.native
  var Database: TypeofClassDatabase = js.native
  var INTERNAL: TypeofINTERNAL = js.native
  var Query: TypeofClassQuery = js.native
  var Reference: Instantiable2[
    /* repo */ Repo, 
    /* path */ Path, 
    typings.atFirebaseDatabase.distSrcApiReferenceMod.Reference
  ] = js.native
  var ServerValue: Anon_TIMESTAMP = js.native
  var TEST_ACCESS: TypeofTEST_ACCESS = js.native
  def enableLogging(): Unit = js.native
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit]): Unit = js.native
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit], persistent: Boolean): Unit = js.native
  def enableLogging(logger_ : Boolean): Unit = js.native
  def enableLogging(logger_ : Boolean, persistent: Boolean): Unit = js.native
}

