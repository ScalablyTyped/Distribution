package typings.dexie

import typings.dexie.dexieMod.TransactionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dexieStrings {
  @js.native
  sealed trait AbortError extends js.Object
  
  @js.native
  sealed trait ConstraintError extends js.Object
  
  @js.native
  sealed trait DataCloneError extends js.Object
  
  @js.native
  sealed trait DataError extends js.Object
  
  @js.native
  sealed trait DatabaseClosedError extends js.Object
  
  @js.native
  sealed trait Error extends js.Object
  
  @js.native
  sealed trait InternalError extends js.Object
  
  @js.native
  sealed trait InvalidAccessError extends js.Object
  
  @js.native
  sealed trait InvalidArgumentError extends js.Object
  
  @js.native
  sealed trait InvalidStateError extends js.Object
  
  @js.native
  sealed trait InvalidTableError extends js.Object
  
  @js.native
  sealed trait MissingAPIError extends js.Object
  
  @js.native
  sealed trait ModifyError extends js.Object
  
  @js.native
  sealed trait NoSuchDatabaseError extends js.Object
  
  @js.native
  sealed trait NotFoundError extends js.Object
  
  @js.native
  sealed trait OpenFailedError extends js.Object
  
  @js.native
  sealed trait Promise extends js.Object
  
  @js.native
  sealed trait QuotaExceededError extends js.Object
  
  @js.native
  sealed trait ReadOnlyError extends js.Object
  
  @js.native
  sealed trait SchemaError extends js.Object
  
  @js.native
  sealed trait SyntaxError extends js.Object
  
  @js.native
  sealed trait TimeoutError extends js.Object
  
  @js.native
  sealed trait TransactionInactiveError extends js.Object
  
  @js.native
  sealed trait UnknownError extends js.Object
  
  @js.native
  sealed trait UnsupportedError extends js.Object
  
  @js.native
  sealed trait UpgradeError extends js.Object
  
  @js.native
  sealed trait VersionChangeError extends js.Object
  
  @js.native
  sealed trait VersionError extends js.Object
  
  @js.native
  sealed trait abort extends js.Object
  
  @js.native
  sealed trait asap extends js.Object
  
  @js.native
  sealed trait blocked extends js.Object
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait creating extends js.Object
  
  @js.native
  sealed trait deleting extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait populate extends js.Object
  
  @js.native
  sealed trait r extends TransactionMode
  
  @js.native
  sealed trait `r!` extends TransactionMode
  
  @js.native
  sealed trait `r?` extends TransactionMode
  
  @js.native
  sealed trait reading extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait rw extends TransactionMode
  
  @js.native
  sealed trait `rw!` extends TransactionMode
  
  @js.native
  sealed trait `rw?` extends TransactionMode
  
  @js.native
  sealed trait updating extends js.Object
  
  @js.native
  sealed trait versionchange extends js.Object
  
  @scala.inline
  def AbortError: AbortError = "AbortError".asInstanceOf[AbortError]
  @scala.inline
  def ConstraintError: ConstraintError = "ConstraintError".asInstanceOf[ConstraintError]
  @scala.inline
  def DataCloneError: DataCloneError = "DataCloneError".asInstanceOf[DataCloneError]
  @scala.inline
  def DataError: DataError = "DataError".asInstanceOf[DataError]
  @scala.inline
  def DatabaseClosedError: DatabaseClosedError = "DatabaseClosedError".asInstanceOf[DatabaseClosedError]
  @scala.inline
  def Error: Error = "Error".asInstanceOf[Error]
  @scala.inline
  def InternalError: InternalError = "InternalError".asInstanceOf[InternalError]
  @scala.inline
  def InvalidAccessError: InvalidAccessError = "InvalidAccessError".asInstanceOf[InvalidAccessError]
  @scala.inline
  def InvalidArgumentError: InvalidArgumentError = "InvalidArgumentError".asInstanceOf[InvalidArgumentError]
  @scala.inline
  def InvalidStateError: InvalidStateError = "InvalidStateError".asInstanceOf[InvalidStateError]
  @scala.inline
  def InvalidTableError: InvalidTableError = "InvalidTableError".asInstanceOf[InvalidTableError]
  @scala.inline
  def MissingAPIError: MissingAPIError = "MissingAPIError".asInstanceOf[MissingAPIError]
  @scala.inline
  def ModifyError: ModifyError = "ModifyError".asInstanceOf[ModifyError]
  @scala.inline
  def NoSuchDatabaseError: NoSuchDatabaseError = "NoSuchDatabaseError".asInstanceOf[NoSuchDatabaseError]
  @scala.inline
  def NotFoundError: NotFoundError = "NotFoundError".asInstanceOf[NotFoundError]
  @scala.inline
  def OpenFailedError: OpenFailedError = "OpenFailedError".asInstanceOf[OpenFailedError]
  @scala.inline
  def Promise: Promise = "Promise".asInstanceOf[Promise]
  @scala.inline
  def QuotaExceededError: QuotaExceededError = "QuotaExceededError".asInstanceOf[QuotaExceededError]
  @scala.inline
  def ReadOnlyError: ReadOnlyError = "ReadOnlyError".asInstanceOf[ReadOnlyError]
  @scala.inline
  def SchemaError: SchemaError = "SchemaError".asInstanceOf[SchemaError]
  @scala.inline
  def SyntaxError: SyntaxError = "SyntaxError".asInstanceOf[SyntaxError]
  @scala.inline
  def TimeoutError: TimeoutError = "TimeoutError".asInstanceOf[TimeoutError]
  @scala.inline
  def TransactionInactiveError: TransactionInactiveError = "TransactionInactiveError".asInstanceOf[TransactionInactiveError]
  @scala.inline
  def UnknownError: UnknownError = "UnknownError".asInstanceOf[UnknownError]
  @scala.inline
  def UnsupportedError: UnsupportedError = "UnsupportedError".asInstanceOf[UnsupportedError]
  @scala.inline
  def UpgradeError: UpgradeError = "UpgradeError".asInstanceOf[UpgradeError]
  @scala.inline
  def VersionChangeError: VersionChangeError = "VersionChangeError".asInstanceOf[VersionChangeError]
  @scala.inline
  def VersionError: VersionError = "VersionError".asInstanceOf[VersionError]
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def asap: asap = "asap".asInstanceOf[asap]
  @scala.inline
  def blocked: blocked = "blocked".asInstanceOf[blocked]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def creating: creating = "creating".asInstanceOf[creating]
  @scala.inline
  def deleting: deleting = "deleting".asInstanceOf[deleting]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def populate: populate = "populate".asInstanceOf[populate]
  @scala.inline
  def r: r = "r".asInstanceOf[r]
  @scala.inline
  def `r!`: `r!` = "r!".asInstanceOf[`r!`]
  @scala.inline
  def `r?`: `r?` = "r?".asInstanceOf[`r?`]
  @scala.inline
  def reading: reading = "reading".asInstanceOf[reading]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def rw: rw = "rw".asInstanceOf[rw]
  @scala.inline
  def `rw!`: `rw!` = "rw!".asInstanceOf[`rw!`]
  @scala.inline
  def `rw?`: `rw?` = "rw?".asInstanceOf[`rw?`]
  @scala.inline
  def updating: updating = "updating".asInstanceOf[updating]
  @scala.inline
  def versionchange: versionchange = "versionchange".asInstanceOf[versionchange]
}

