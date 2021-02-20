package typings.gfc

import typings.gfc.anon.Contents
import typings.gfc.anon.Stderr
import typings.gfc.gfcBooleans.`false`
import typings.gfc.gfcStrings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.childProcessMod.ExecException
import typings.node.childProcessMod.ExecSyncOptions
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gfc", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[Stderr] = js.native
  @JSImport("gfc", JSImport.Namespace)
  @js.native
  def apply(cwd: String): js.Promise[Stderr] = js.native
  @JSImport("gfc", JSImport.Namespace)
  @js.native
  def apply(
    cwd: String,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("gfc", JSImport.Namespace)
  @js.native
  def apply(cwd: String, options: Options[ExecOptionsWithEncoding]): js.Promise[Stderr] = js.native
  @JSImport("gfc", JSImport.Namespace)
  @js.native
  def apply(
    cwd: String,
    options: Options[ExecOptionsWithEncoding],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("gfc", JSImport.Namespace)
  @js.native
  def apply(options: Options[ExecOptionsWithEncoding]): js.Promise[Stderr] = js.native
  
  @JSImport("gfc", "sync")
  @js.native
  def sync(): String | Buffer = js.native
  @JSImport("gfc", "sync")
  @js.native
  def sync(cwd: String): String | Buffer = js.native
  @JSImport("gfc", "sync")
  @js.native
  def sync(cwd: String, options: Options[ExecSyncOptions]): String | Buffer = js.native
  @JSImport("gfc", "sync")
  @js.native
  def sync(options: Options[ExecSyncOptions]): String | Buffer = js.native
  
  /* Inlined {  encoding :node.BufferEncoding | 'buffer' | null | undefined} & node.child_process.ExecOptions */
  @js.native
  trait ExecOptionsWithEncoding extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var encoding: js.UndefOr[BufferEncoding | buffer | Null] = js.native
    
    var env: js.UndefOr[ProcessEnv] = js.native
    
    var gid: js.UndefOr[Double] = js.native
    
    var killSignal: js.UndefOr[Signals | Double] = js.native
    
    var maxBuffer: js.UndefOr[Double] = js.native
    
    var shell: js.UndefOr[String] = js.native
    
    /**
      * @default 0
      */
    var timeout: js.UndefOr[Double] = js.native
    
    var uid: js.UndefOr[Double] = js.native
    
    /**
      * @default true
      */
    var windowsHide: js.UndefOr[Boolean] = js.native
  }
  object ExecOptionsWithEncoding {
    
    @scala.inline
    def apply(): ExecOptionsWithEncoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecOptionsWithEncoding]
    }
    
    @scala.inline
    implicit class ExecOptionsWithEncodingMutableBuilder[Self <: ExecOptionsWithEncoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEncoding(value: BufferEncoding | buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      @scala.inline
      def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      @scala.inline
      def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
    }
  }
  
  @js.native
  trait Options[TExecOptions] extends StObject {
    
    var commit: js.UndefOr[Boolean] = js.native
    
    var cwd: js.UndefOr[String] = js.native
    
    var exec: js.UndefOr[TExecOptions] = js.native
    
    var file: js.UndefOr[Contents | `false`] = js.native
    
    var forceFile: js.UndefOr[Boolean] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var push: js.UndefOr[Boolean] = js.native
    
    var remote: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[TExecOptions](): Options[TExecOptions] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[TExecOptions]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], TExecOptions] (val x: Self with Options[TExecOptions]) extends AnyVal {
      
      @scala.inline
      def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setExec(value: TExecOptions): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      @scala.inline
      def setFile(value: Contents | `false`): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setForceFile(value: Boolean): Self = StObject.set(x, "forceFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceFileUndefined: Self = StObject.set(x, "forceFile", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      @scala.inline
      def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
    }
  }
}
