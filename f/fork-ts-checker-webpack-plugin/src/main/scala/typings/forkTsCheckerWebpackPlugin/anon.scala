package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libFilesChangeMod.FilesChange
import typings.forkTsCheckerWebpackPlugin.libIssueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.libWatchWatchFileSystemMod.Watchpack
import typings.tapable.mod.AsyncSeriesWaterfallHook
import typings.tapable.mod.SyncHook
import typings.tapable.mod.SyncWaterfallHook
import typings.tapable.mod.UnsetAdditionalOptions
import typings.typescript.mod.IScriptSnapshot
import typings.webpack.mod.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Canceled extends StObject {
    
    var canceled: SyncHook[js.Array[Compilation], Unit, UnsetAdditionalOptions]
    
    var error: SyncHook[js.Tuple2[Any, Compilation], Unit, UnsetAdditionalOptions]
    
    var issues: SyncWaterfallHook[js.Tuple2[js.Array[Issue], js.UndefOr[Compilation]], Unit]
    
    var start: AsyncSeriesWaterfallHook[js.Tuple2[FilesChange, Compilation], UnsetAdditionalOptions]
    
    var waiting: SyncHook[js.Array[Compilation], Unit, UnsetAdditionalOptions]
  }
  object Canceled {
    
    inline def apply(
      canceled: SyncHook[js.Array[Compilation], Unit, UnsetAdditionalOptions],
      error: SyncHook[js.Tuple2[Any, Compilation], Unit, UnsetAdditionalOptions],
      issues: SyncWaterfallHook[js.Tuple2[js.Array[Issue], js.UndefOr[Compilation]], Unit],
      start: AsyncSeriesWaterfallHook[js.Tuple2[FilesChange, Compilation], UnsetAdditionalOptions],
      waiting: SyncHook[js.Array[Compilation], Unit, UnsetAdditionalOptions]
    ): Canceled = {
      val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[Canceled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Canceled] (val x: Self) extends AnyVal {
      
      inline def setCanceled(value: SyncHook[js.Array[Compilation], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
      
      inline def setError(value: SyncHook[js.Tuple2[Any, Compilation], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setIssues(value: SyncWaterfallHook[js.Tuple2[js.Array[Issue], js.UndefOr[Compilation]], Unit]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setStart(value: AsyncSeriesWaterfallHook[js.Tuple2[FilesChange, Compilation], UnsetAdditionalOptions]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setWaiting(value: SyncHook[js.Array[Compilation], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/typescript/type-script-diagnostics-options.TypeScriptDiagnosticsOptions> */
  trait PartialTypeScriptDiagnost extends StObject {
    
    var declaration: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var semantic: js.UndefOr[Boolean] = js.undefined
    
    var syntactic: js.UndefOr[Boolean] = js.undefined
  }
  object PartialTypeScriptDiagnost {
    
    inline def apply(): PartialTypeScriptDiagnost = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTypeScriptDiagnost]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialTypeScriptDiagnost] (val x: Self) extends AnyVal {
      
      inline def setDeclaration(value: Boolean): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setSemantic(value: Boolean): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
      
      inline def setSemanticUndefined: Self = StObject.set(x, "semantic", js.undefined)
      
      inline def setSyntactic(value: Boolean): Self = StObject.set(x, "syntactic", value.asInstanceOf[js.Any])
      
      inline def setSyntacticUndefined: Self = StObject.set(x, "syntactic", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    var path: String
    
    var prepend: js.UndefOr[Boolean] = js.undefined
  }
  object Path {
    
    inline def apply(path: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
    }
  }
  
  trait Promise[T] extends StObject {
    
    var promise: js.Promise[T]
    
    def reject(error: Any): Unit
    
    def resolve(value: T): Unit
  }
  object Promise {
    
    inline def apply[T](promise: js.Promise[T], reject: Any => Unit, resolve: T => Unit): Promise[T] = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Promise[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Promise[?], T] (val x: Self & Promise[T]) extends AnyVal {
      
      inline def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setReject(value: Any => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: T => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  trait TypeofScriptSnapshot extends StObject {
    
    def fromString(text: String): IScriptSnapshot
  }
  object TypeofScriptSnapshot {
    
    inline def apply(fromString: String => IScriptSnapshot): TypeofScriptSnapshot = {
      val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
      __obj.asInstanceOf[TypeofScriptSnapshot]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofScriptSnapshot] (val x: Self) extends AnyVal {
      
      inline def setFromString(value: String => IScriptSnapshot): Self = StObject.set(x, "fromString", js.Any.fromFunction1(value))
    }
  }
  
  trait Watcher extends StObject {
    
    var watcher: Watchpack
  }
  object Watcher {
    
    inline def apply(watcher: Watchpack): Watcher = {
      val __obj = js.Dynamic.literal(watcher = watcher.asInstanceOf[js.Any])
      __obj.asInstanceOf[Watcher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Watcher] (val x: Self) extends AnyVal {
      
      inline def setWatcher(value: Watchpack): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
    }
  }
}
