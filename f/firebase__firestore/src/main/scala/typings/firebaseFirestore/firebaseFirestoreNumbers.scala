package typings.firebaseFirestore

import typings.firebaseFirestore.connectivityMonitorMod.NetworkStatus
import typings.firebaseFirestore.mutationMod.MutationType
import typings.firebaseFirestore.objectValueMod.TypeOrder
import typings.firebaseFirestore.targetDataMod.TargetPurpose
import typings.firebaseFirestore.typesMod.OnlineStateSource
import typings.firebaseFirestore.userDataReaderMod.UserDataSource
import typings.firebaseFirestore.viewSnapshotMod.ChangeType
import typings.firebaseFirestore.viewSnapshotMod.SyncState
import typings.firebaseFirestore.watchChangeMod.WatchTargetChangeState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object firebaseFirestoreNumbers {
  @js.native
  sealed trait `0`
    extends ChangeType
       with MutationType
       with NetworkStatus
       with OnlineStateSource
       with SyncState
       with TargetPurpose
       with TypeOrder
       with UserDataSource
       with WatchTargetChangeState
  
  @js.native
  sealed trait `1`
    extends ChangeType
       with MutationType
       with NetworkStatus
       with OnlineStateSource
       with SyncState
       with TargetPurpose
       with TypeOrder
       with UserDataSource
       with WatchTargetChangeState
  
  @js.native
  sealed trait `10` extends TypeOrder
  
  @js.native
  sealed trait `2`
    extends ChangeType
       with MutationType
       with TargetPurpose
       with TypeOrder
       with UserDataSource
       with WatchTargetChangeState
  
  @js.native
  sealed trait `3`
    extends ChangeType
       with MutationType
       with TypeOrder
       with UserDataSource
       with WatchTargetChangeState
  
  @js.native
  sealed trait `4`
    extends MutationType
       with TypeOrder
       with UserDataSource
       with WatchTargetChangeState
  
  @js.native
  sealed trait `5` extends TypeOrder
  
  @js.native
  sealed trait `6` extends TypeOrder
  
  @js.native
  sealed trait `7` extends TypeOrder
  
  @js.native
  sealed trait `8` extends TypeOrder
  
  @js.native
  sealed trait `9` extends TypeOrder
  
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `10`: `10` = 10.asInstanceOf[`10`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  @scala.inline
  def `4`: `4` = 4.asInstanceOf[`4`]
  @scala.inline
  def `5`: `5` = 5.asInstanceOf[`5`]
  @scala.inline
  def `6`: `6` = 6.asInstanceOf[`6`]
  @scala.inline
  def `7`: `7` = 7.asInstanceOf[`7`]
  @scala.inline
  def `8`: `8` = 8.asInstanceOf[`8`]
  @scala.inline
  def `9`: `9` = 9.asInstanceOf[`9`]
}

