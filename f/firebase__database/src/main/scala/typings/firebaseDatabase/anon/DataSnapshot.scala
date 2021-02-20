package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.referenceMod.Reference
import typings.firebaseDatabase.repoMod.Repo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSnapshot extends StObject {
  
  var DataSnapshot: Instantiable3[
    /* node_ */ Node, 
    /* ref_ */ Reference, 
    /* index_ */ Index, 
    typings.firebaseDatabase.dataSnapshotMod.DataSnapshot
  ] = js.native
  
  var Database: TypeofDatabase = js.native
  
  var INTERNAL: TypeofINTERNAL = js.native
  
  var Query: TypeofQuery = js.native
  
  var Reference: Instantiable2[
    /* repo */ Repo, 
    /* path */ typings.firebaseDatabase.pathMod.Path, 
    typings.firebaseDatabase.referenceMod.Reference
  ] = js.native
  
  var ServerValue: TIMESTAMP = js.native
  
  var TEST_ACCESS: TypeofTESTACCESS = js.native
  
  def enableLogging(): Unit = js.native
  def enableLogging(logger_ : js.UndefOr[scala.Nothing], persistent: Boolean): Unit = js.native
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit]): Unit = js.native
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit], persistent: Boolean): Unit = js.native
  def enableLogging(logger_ : Boolean): Unit = js.native
  def enableLogging(logger_ : Boolean, persistent: Boolean): Unit = js.native
}
