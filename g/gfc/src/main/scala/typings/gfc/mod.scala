package typings.gfc

import typings.gfc.anon.Contents
import typings.gfc.anon.Stderr
import typings.gfc.gfcBooleans.`false`
import typings.gfc.gfcStrings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.childProcessMod.ExecException
import typings.node.childProcessMod.ExecOptions
import typings.node.childProcessMod.ExecSyncOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Promise[Stderr] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Stderr]]
  @scala.inline
  def apply(cwd: String): js.Promise[Stderr] = ^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stderr]]
  @scala.inline
  def apply(
    cwd: String,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(cwd: String, options: Options[ExecOptionsWithEncoding]): js.Promise[Stderr] = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stderr]]
  @scala.inline
  def apply(
    cwd: String,
    options: Options[ExecOptionsWithEncoding],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(options: Options[ExecOptionsWithEncoding]): js.Promise[Stderr] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stderr]]
  
  @JSImport("gfc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sync(): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[String | Buffer]
  @scala.inline
  def sync(cwd: String): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(cwd.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  @scala.inline
  def sync(cwd: String, options: Options[ExecSyncOptions]): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(cwd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  @scala.inline
  def sync(options: Options[ExecSyncOptions]): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  
  trait ExecOptionsWithEncoding
    extends StObject
       with ExecOptions {
    
    var encoding: js.UndefOr[BufferEncoding | buffer | Null] = js.undefined
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
      def setEncoding(value: BufferEncoding | buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait Options[TExecOptions] extends StObject {
    
    var commit: js.UndefOr[Boolean] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var exec: js.UndefOr[TExecOptions] = js.undefined
    
    var file: js.UndefOr[Contents | `false`] = js.undefined
    
    var forceFile: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var push: js.UndefOr[Boolean] = js.undefined
    
    var remote: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[TExecOptions](): Options[TExecOptions] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[TExecOptions]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], TExecOptions] (val x: Self & Options[TExecOptions]) extends AnyVal {
      
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
