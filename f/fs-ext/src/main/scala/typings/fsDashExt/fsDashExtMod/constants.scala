package typings.fsDashExt.fsDashExtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-ext", "constants")
@js.native
object constants extends js.Object {
  /**
    * The close-on-exec flag.
    */
  val FD_CLOEXEC: Double = js.native
  /**
    * Return (as the function result) the file descriptor flags. `arg` is ignored.
    */
  val F_GETFD: Double = js.native
  /**
    * Test for the existence locks.
    */
  val F_GETLK: Double = js.native
  /**
    * A read lock on a file.
    */
  val F_RDLCK: Double = js.native
  /**
    * Set the file descriptor flags to the value specified by `arg`.
    */
  val F_SETFD: Double = js.native
  /**
    * Acquire a lock (when constants F_RDLCK or F_WRLCK are specified) or release a lock (when
    * constant F_UNLCK is specified).
    */
  val F_SETLK: Double = js.native
  /**
    * As for F_SETLK, but if a conflicting lock is held on the file, then wait for that lock to be
    * released.
    */
  val F_SETLKW: Double = js.native
  /**
    * Unlock a file.
    */
  val F_UNLCK: Double = js.native
  /**
    * A write lock on a file.
    */
  val F_WRLCK: Double = js.native
  /**
    * Place an exclusive lock. Only one process may hold an exclusive lock for a given file at a
    * given time.
    */
  val LOCK_EX: Double = js.native
  /**
    * A call to flock() may block if an incompatible lock is held by another process. To make a
    * nonblocking request, include LOCK_NB (by ORing) with any of the above operations.
    */
  val LOCK_NB: Double = js.native
  /**
    * Place a shared lock. More than one process may hold a shared lock for a given file at a given
    * time.
    */
  val LOCK_SH: Double = js.native
  /**
    * Remove an existing lock held by this process.
    */
  val LOCK_UN: Double = js.native
  /**
    * The file offset is set to its current location plus `offset` bytes.
    */
  val SEEK_CUR: Double = js.native
  /**
    * The file offset is set to the size of the file plus `offset` bytes.
    */
  val SEEK_END: Double = js.native
  /**
    * The file offset is set to offset bytes.
    */
  val SEEK_SET: Double = js.native
}

