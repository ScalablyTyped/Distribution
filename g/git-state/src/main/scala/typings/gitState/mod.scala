package typings.gitState

import typings.node.childProcessMod.ExecException
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ahead(path: String, cb: js.Function2[/* error */ ExecException | Null, /* ahead */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ahead")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ahead(
    path: String,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* ahead */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ahead")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ahead(
    path: String,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* ahead */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ahead")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ahead(path: URL, cb: js.Function2[/* error */ ExecException | Null, /* ahead */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ahead")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ahead(
    path: URL,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* ahead */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ahead")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ahead(
    path: URL,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* ahead */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ahead")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def aheadSync(path: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("aheadSync")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def aheadSync(path: String, opts: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("aheadSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def aheadSync(path: URL): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("aheadSync")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def aheadSync(path: URL, opts: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("aheadSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def branch(
    path: String,
    cb: js.Function2[/* error */ ExecException | Null, /* branch */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("branch")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def branch(
    path: String,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* branch */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("branch")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def branch(
    path: String,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* branch */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("branch")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def branch(
    path: URL,
    cb: js.Function2[/* error */ ExecException | Null, /* branch */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("branch")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def branch(
    path: URL,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* branch */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("branch")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def branch(
    path: URL,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* branch */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("branch")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def branchSync(path: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("branchSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def branchSync(path: String, opts: Options): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("branchSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def branchSync(path: URL): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("branchSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def branchSync(path: URL, opts: Options): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("branchSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def check(path: String, cb: js.Function2[/* error */ ExecException | Null, /* result */ CheckResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(
    path: String,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* result */ CheckResult, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(
    path: String,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* result */ CheckResult, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(path: URL, cb: js.Function2[/* error */ ExecException | Null, /* result */ CheckResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(
    path: URL,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* result */ CheckResult, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(
    path: URL,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* result */ CheckResult, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkSync(path: String): CheckResult = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSync")(path.asInstanceOf[js.Any]).asInstanceOf[CheckResult]
  inline def checkSync(path: String, opts: Options): CheckResult = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CheckResult]
  inline def checkSync(path: URL): CheckResult = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSync")(path.asInstanceOf[js.Any]).asInstanceOf[CheckResult]
  inline def checkSync(path: URL, opts: Options): CheckResult = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CheckResult]
  
  inline def commit(path: String, cb: js.Function2[/* error */ ExecException | Null, /* commitHash */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def commit(
    path: String,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* commitHash */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def commit(
    path: String,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* commitHash */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def commit(path: URL, cb: js.Function2[/* error */ ExecException | Null, /* commitHash */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def commit(
    path: URL,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* commitHash */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def commit(
    path: URL,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* commitHash */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def commitSync(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("commitSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def commitSync(path: String, opts: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("commitSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def commitSync(path: URL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("commitSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def commitSync(path: URL, opts: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("commitSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def dirty(path: String, cb: js.Function2[/* error */ ExecException | Null, /* dirty */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dirty")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dirty(
    path: String,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* dirty */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dirty")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dirty(
    path: String,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* dirty */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dirty")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dirty(path: URL, cb: js.Function2[/* error */ ExecException | Null, /* dirty */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dirty")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dirty(
    path: URL,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* dirty */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dirty")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dirty(
    path: URL,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* dirty */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dirty")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dirtySync(path: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dirtySync")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def dirtySync(path: String, opts: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dirtySync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dirtySync(path: URL): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dirtySync")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def dirtySync(path: URL, opts: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dirtySync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isGit(path: String, cb: js.Function1[/* isGit */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isGit")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isGitSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGitSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def message(path: String, cb: js.Function2[/* error */ ExecException | Null, /* message */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def message(
    path: String,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* message */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def message(
    path: String,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* message */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def message(path: URL, cb: js.Function2[/* error */ ExecException | Null, /* message */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def message(
    path: URL,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* message */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def message(
    path: URL,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* message */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def messageSync(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("messageSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def messageSync(path: String, opts: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("messageSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def messageSync(path: URL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("messageSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def messageSync(path: URL, opts: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("messageSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stashes(path: String, cb: js.Function2[/* error */ ExecException | Null, /* stashes */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stashes")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stashes(
    path: String,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* stashes */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stashes")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stashes(
    path: String,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* stashes */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stashes")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stashes(path: URL, cb: js.Function2[/* error */ ExecException | Null, /* stashes */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stashes")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stashes(
    path: URL,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* stashes */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stashes")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stashes(
    path: URL,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* stashes */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stashes")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stashesSync(path: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stashesSync")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def stashesSync(path: String, opts: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("stashesSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def stashesSync(path: URL): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stashesSync")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def stashesSync(path: URL, opts: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("stashesSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def untracked(path: String, cb: js.Function2[/* error */ ExecException | Null, /* untracked */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def untracked(
    path: String,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* untracked */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def untracked(
    path: String,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* untracked */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def untracked(path: URL, cb: js.Function2[/* error */ ExecException | Null, /* untracked */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def untracked(
    path: URL,
    opts: Unit,
    cb: js.Function2[/* error */ ExecException | Null, /* untracked */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def untracked(
    path: URL,
    opts: Options,
    cb: js.Function2[/* error */ ExecException | Null, /* untracked */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def untrackedSync(path: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("untrackedSync")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def untrackedSync(path: String, opts: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("untrackedSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def untrackedSync(path: URL): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("untrackedSync")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def untrackedSync(path: URL, opts: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("untrackedSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait CheckResult extends StObject {
    
    /**
      * The amount of commits the current branch is ahead of the remote
      * (may be `NaN` if there for instance is no remote).
      */
    var ahead: Double
    
    /**
      * The currently checked out branch.
      */
    var branch: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The number of dirty files.
      */
    var dirty: Double
    
    /**
      * The number of stored stashes.
      */
    var stashes: Double
    
    /**
      * The number of untracked files.
      */
    var untracked: Double
  }
  object CheckResult {
    
    inline def apply(ahead: Double, dirty: Double, stashes: Double, untracked: Double): CheckResult = {
      val __obj = js.Dynamic.literal(ahead = ahead.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], stashes = stashes.asInstanceOf[js.Any], untracked = untracked.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckResult] (val x: Self) extends AnyVal {
      
      inline def setAhead(value: Double): Self = StObject.set(x, "ahead", value.asInstanceOf[js.Any])
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchNull: Self = StObject.set(x, "branch", null)
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setDirty(value: Double): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setStashes(value: Double): Self = StObject.set(x, "stashes", value.asInstanceOf[js.Any])
      
      inline def setUntracked(value: Double): Self = StObject.set(x, "untracked", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Largest amount of data (in bytes) allowed on stdout or
      * stderr - if exceeded child process is killed.
      *
      * @default 200*1024
      */
    var maxBuffer: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
    }
  }
}
