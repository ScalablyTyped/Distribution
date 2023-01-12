package typings.fsExt

import typings.fsExt.fsExtStrings.ex
import typings.fsExt.fsExtStrings.exnb
import typings.fsExt.fsExtStrings.getfd
import typings.fsExt.fsExtStrings.getlk
import typings.fsExt.fsExtStrings.setfd
import typings.fsExt.fsExtStrings.setlk
import typings.fsExt.fsExtStrings.setlkw
import typings.fsExt.fsExtStrings.sh
import typings.fsExt.fsExtStrings.shnb
import typings.fsExt.fsExtStrings.un
import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-ext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object constants {
    
    /**
      * The close-on-exec flag.
      */
    @JSImport("fs-ext", "constants.FD_CLOEXEC")
    @js.native
    val FD_CLOEXEC: Double = js.native
    
    /**
      * Return (as the function result) the file descriptor flags. `arg` is ignored.
      */
    @JSImport("fs-ext", "constants.F_GETFD")
    @js.native
    val F_GETFD: Double = js.native
    
    /**
      * Test for the existence locks.
      */
    @JSImport("fs-ext", "constants.F_GETLK")
    @js.native
    val F_GETLK: Double = js.native
    
    /**
      * A read lock on a file.
      */
    @JSImport("fs-ext", "constants.F_RDLCK")
    @js.native
    val F_RDLCK: Double = js.native
    
    /**
      * Set the file descriptor flags to the value specified by `arg`.
      */
    @JSImport("fs-ext", "constants.F_SETFD")
    @js.native
    val F_SETFD: Double = js.native
    
    /**
      * Acquire a lock (when constants F_RDLCK or F_WRLCK are specified) or release a lock (when
      * constant F_UNLCK is specified).
      */
    @JSImport("fs-ext", "constants.F_SETLK")
    @js.native
    val F_SETLK: Double = js.native
    
    /**
      * As for F_SETLK, but if a conflicting lock is held on the file, then wait for that lock to be
      * released.
      */
    @JSImport("fs-ext", "constants.F_SETLKW")
    @js.native
    val F_SETLKW: Double = js.native
    
    /**
      * Unlock a file.
      */
    @JSImport("fs-ext", "constants.F_UNLCK")
    @js.native
    val F_UNLCK: Double = js.native
    
    /**
      * A write lock on a file.
      */
    @JSImport("fs-ext", "constants.F_WRLCK")
    @js.native
    val F_WRLCK: Double = js.native
    
    /**
      * Place an exclusive lock. Only one process may hold an exclusive lock for a given file at a
      * given time.
      */
    @JSImport("fs-ext", "constants.LOCK_EX")
    @js.native
    val LOCK_EX: Double = js.native
    
    /**
      * A call to flock() may block if an incompatible lock is held by another process. To make a
      * nonblocking request, include LOCK_NB (by ORing) with any of the above operations.
      */
    @JSImport("fs-ext", "constants.LOCK_NB")
    @js.native
    val LOCK_NB: Double = js.native
    
    /**
      * Place a shared lock. More than one process may hold a shared lock for a given file at a given
      * time.
      */
    @JSImport("fs-ext", "constants.LOCK_SH")
    @js.native
    val LOCK_SH: Double = js.native
    
    /**
      * Remove an existing lock held by this process.
      */
    @JSImport("fs-ext", "constants.LOCK_UN")
    @js.native
    val LOCK_UN: Double = js.native
    
    /**
      * The file offset is set to its current location plus `offset` bytes.
      */
    @JSImport("fs-ext", "constants.SEEK_CUR")
    @js.native
    val SEEK_CUR: Double = js.native
    
    /**
      * The file offset is set to the size of the file plus `offset` bytes.
      */
    @JSImport("fs-ext", "constants.SEEK_END")
    @js.native
    val SEEK_END: Double = js.native
    
    /**
      * The file offset is set to offset bytes.
      */
    @JSImport("fs-ext", "constants.SEEK_SET")
    @js.native
    val SEEK_SET: Double = js.native
  }
  
  inline def fcntl(
    fd: Double,
    cmd: getfd | setfd | setlk | setlkw | getlk,
    arg: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* result */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fcntl")(fd.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fcntl(
    fd: Double,
    cmd: getfd | setfd | setlk | setlkw | getlk,
    callback: js.Function2[/* err */ ErrnoException | Null, /* result */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fcntl")(fd.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fcntl(
    fd: Double,
    cmd: Double,
    arg: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* result */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fcntl")(fd.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fcntl(
    fd: Double,
    cmd: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* result */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fcntl")(fd.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fcntlSync(fd: Double, cmd: getfd | setfd | setlk | setlkw | getlk): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fcntlSync")(fd.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def fcntlSync(fd: Double, cmd: getfd | setfd | setlk | setlkw | getlk, arg: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fcntlSync")(fd.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def fcntlSync(fd: Double, cmd: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fcntlSync")(fd.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def fcntlSync(fd: Double, cmd: Double, arg: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fcntlSync")(fd.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def flock(
    fd: Double,
    flags: sh | ex | shnb | exnb | un,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flock")(fd.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flock(fd: Double, flags: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flock")(fd.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def flockSync(fd: Double, flags: sh | ex | shnb | exnb | un): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flockSync")(fd.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flockSync(fd: Double, flags: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flockSync")(fd.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def seek(
    fd: Double,
    offset: Double,
    whence: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* currFilePos */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("seek")(fd.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], whence.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def seekSync(fd: Double, offset: Double, whence: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("seekSync")(fd.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], whence.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def statVFS(): StatFVS = ^.asInstanceOf[js.Dynamic].applyDynamic("statVFS")().asInstanceOf[StatFVS]
  inline def statVFS(callback: js.Function2[/* err */ ErrnoException | Null, /* stat */ StatFVS, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("statVFS")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def statVFS(path: String): StatFVS = ^.asInstanceOf[js.Dynamic].applyDynamic("statVFS")(path.asInstanceOf[js.Any]).asInstanceOf[StatFVS]
  inline def statVFS(path: String, callback: js.Function2[/* err */ ErrnoException | Null, /* stat */ StatFVS, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statVFS")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait StatFVS extends StObject {
    
    /** Number of free blocks for unprivileged users. */
    var f_bavail: Double
    
    /** Number of free blocks. */
    var f_bfree: Double
    
    /** Size of fs in f_frsize units. */
    var f_blocks: Double
    
    /** File system block size. */
    var f_bsize: Double
    
    /** Number of free inodes for unprivileged users. */
    var f_favail: Double
    
    /** Number of free inodes. */
    var f_ffree: Double
    
    /** Number of inodes. */
    var f_files: Double
    
    /** Mount flags. */
    var f_flag: Double
    
    /** Fragment size. */
    var f_frsize: Double
    
    /** Filesystem ID. */
    var f_fsid: Double
    
    /** Maximum filename length. */
    var f_namemax: Double
  }
  object StatFVS {
    
    inline def apply(
      f_bavail: Double,
      f_bfree: Double,
      f_blocks: Double,
      f_bsize: Double,
      f_favail: Double,
      f_ffree: Double,
      f_files: Double,
      f_flag: Double,
      f_frsize: Double,
      f_fsid: Double,
      f_namemax: Double
    ): StatFVS = {
      val __obj = js.Dynamic.literal(f_bavail = f_bavail.asInstanceOf[js.Any], f_bfree = f_bfree.asInstanceOf[js.Any], f_blocks = f_blocks.asInstanceOf[js.Any], f_bsize = f_bsize.asInstanceOf[js.Any], f_favail = f_favail.asInstanceOf[js.Any], f_ffree = f_ffree.asInstanceOf[js.Any], f_files = f_files.asInstanceOf[js.Any], f_flag = f_flag.asInstanceOf[js.Any], f_frsize = f_frsize.asInstanceOf[js.Any], f_fsid = f_fsid.asInstanceOf[js.Any], f_namemax = f_namemax.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatFVS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatFVS] (val x: Self) extends AnyVal {
      
      inline def setF_bavail(value: Double): Self = StObject.set(x, "f_bavail", value.asInstanceOf[js.Any])
      
      inline def setF_bfree(value: Double): Self = StObject.set(x, "f_bfree", value.asInstanceOf[js.Any])
      
      inline def setF_blocks(value: Double): Self = StObject.set(x, "f_blocks", value.asInstanceOf[js.Any])
      
      inline def setF_bsize(value: Double): Self = StObject.set(x, "f_bsize", value.asInstanceOf[js.Any])
      
      inline def setF_favail(value: Double): Self = StObject.set(x, "f_favail", value.asInstanceOf[js.Any])
      
      inline def setF_ffree(value: Double): Self = StObject.set(x, "f_ffree", value.asInstanceOf[js.Any])
      
      inline def setF_files(value: Double): Self = StObject.set(x, "f_files", value.asInstanceOf[js.Any])
      
      inline def setF_flag(value: Double): Self = StObject.set(x, "f_flag", value.asInstanceOf[js.Any])
      
      inline def setF_frsize(value: Double): Self = StObject.set(x, "f_frsize", value.asInstanceOf[js.Any])
      
      inline def setF_fsid(value: Double): Self = StObject.set(x, "f_fsid", value.asInstanceOf[js.Any])
      
      inline def setF_namemax(value: Double): Self = StObject.set(x, "f_namemax", value.asInstanceOf[js.Any])
    }
  }
}
