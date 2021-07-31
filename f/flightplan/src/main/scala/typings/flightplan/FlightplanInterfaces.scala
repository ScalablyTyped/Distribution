package typings.flightplan

import typings.flightplan.anon.Exec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FlightplanInterfaces {
  
  trait CommandOptions extends StObject {
    
    var failsafe: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object CommandOptions {
    
    @scala.inline
    def apply(): CommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandOptions]
    }
    
    @scala.inline
    implicit class CommandOptionsMutableBuilder[Self <: CommandOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailsafe(value: Boolean): Self = StObject.set(x, "failsafe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailsafeUndefined: Self = StObject.set(x, "failsafe", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait CommandResult extends StObject {
    
    var code: Double
    
    var stderr: String
    
    var stdout: String
  }
  object CommandResult {
    
    @scala.inline
    def apply(code: Double, stderr: String, stdout: String): CommandResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandResult]
    }
    
    @scala.inline
    implicit class CommandResultMutableBuilder[Self <: CommandResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Flightplan extends StObject {
    
    def abort(): Unit = js.native
    def abort(message: String): Unit = js.native
    
    def local(fn: js.Function1[/* transport */ Transport, Unit]): Flightplan = js.native
    def local(task: String, fn: js.Function1[/* transport */ Transport, Unit]): Flightplan = js.native
    def local(task: js.Array[String], fn: js.Function1[/* transport */ Transport, Unit]): Flightplan = js.native
    
    def remote(fn: js.Function1[/* transport */ Transport, Unit]): Flightplan = js.native
    def remote(task: String, fn: js.Function1[/* transport */ Transport, Unit]): Flightplan = js.native
    def remote(task: js.Array[String], fn: js.Function1[/* transport */ Transport, Unit]): Flightplan = js.native
    
    var runtime: Runtime = js.native
    
    def target(name: String, fn: js.Function1[/* done */ js.Function1[/* result */ js.Any, Unit], Unit]): Flightplan = js.native
    def target(name: String, options: js.Array[TargetOptions]): Flightplan = js.native
    def target(name: String, options: TargetOptions): Flightplan = js.native
  }
  
  trait Host extends StObject {
    
    var host: String
    
    var port: Double
  }
  object Host {
    
    @scala.inline
    def apply(host: String, port: Double): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromptOptions extends StObject {
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object PromptOptions {
    
    @scala.inline
    def apply(): PromptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromptOptions]
    }
    
    @scala.inline
    implicit class PromptOptionsMutableBuilder[Self <: PromptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  trait Runtime extends StObject {
    
    var hosts: js.Array[Host]
    
    var options: js.Any
    
    var target: String
    
    var task: String
  }
  object Runtime {
    
    @scala.inline
    def apply(hosts: js.Array[Host], options: js.Any, target: String, task: String): Runtime = {
      val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
      __obj.asInstanceOf[Runtime]
    }
    
    @scala.inline
    implicit class RuntimeMutableBuilder[Self <: Runtime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHosts(value: js.Array[Host]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostsVarargs(value: Host*): Self = StObject.set(x, "hosts", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    }
  }
  
  trait SudoOptions
    extends StObject
       with CommandOptions {
    
    var user: js.UndefOr[String] = js.undefined
  }
  object SudoOptions {
    
    @scala.inline
    def apply(): SudoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SudoOptions]
    }
    
    @scala.inline
    implicit class SudoOptionsMutableBuilder[Self <: SudoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait TargetOptions extends StObject {
    
    var agent: String
    
    var failsafe: js.UndefOr[Boolean] = js.undefined
    
    var host: String
    
    var username: String
  }
  object TargetOptions {
    
    @scala.inline
    def apply(agent: String, host: String, username: String): TargetOptions = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetOptions]
    }
    
    @scala.inline
    implicit class TargetOptionsMutableBuilder[Self <: TargetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailsafe(value: Boolean): Self = StObject.set(x, "failsafe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailsafeUndefined: Self = StObject.set(x, "failsafe", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Transport extends StObject {
    
    def awk(command: String): CommandResult = js.native
    def awk(command: String, options: CommandOptions): CommandResult = js.native
    def awk(command: String, options: Exec): CommandResult = js.native
    
    def cat(command: String): CommandResult = js.native
    def cat(command: String, options: CommandOptions): CommandResult = js.native
    def cat(command: String, options: Exec): CommandResult = js.native
    
    def cd(command: String): CommandResult = js.native
    def cd(command: String, options: CommandOptions): CommandResult = js.native
    def cd(command: String, options: Exec): CommandResult = js.native
    
    def chgrp(command: String): CommandResult = js.native
    def chgrp(command: String, options: CommandOptions): CommandResult = js.native
    def chgrp(command: String, options: Exec): CommandResult = js.native
    
    def chmod(command: String): CommandResult = js.native
    def chmod(command: String, options: CommandOptions): CommandResult = js.native
    def chmod(command: String, options: Exec): CommandResult = js.native
    
    def chown(command: String): CommandResult = js.native
    def chown(command: String, options: CommandOptions): CommandResult = js.native
    def chown(command: String, options: Exec): CommandResult = js.native
    
    def cp(command: String): CommandResult = js.native
    def cp(command: String, options: CommandOptions): CommandResult = js.native
    def cp(command: String, options: Exec): CommandResult = js.native
    
    def debug(message: String): Unit = js.native
    
    def echo(command: String): CommandResult = js.native
    def echo(command: String, options: CommandOptions): CommandResult = js.native
    def echo(command: String, options: Exec): CommandResult = js.native
    
    def exec(command: String): CommandResult = js.native
    def exec(command: String, options: CommandOptions): CommandResult = js.native
    def exec(command: String, options: Exec): CommandResult = js.native
    
    def failsafe(): Unit = js.native
    
    def find(command: String): CommandResult = js.native
    def find(command: String, options: CommandOptions): CommandResult = js.native
    def find(command: String, options: Exec): CommandResult = js.native
    
    def ftp(command: String): CommandResult = js.native
    def ftp(command: String, options: CommandOptions): CommandResult = js.native
    def ftp(command: String, options: Exec): CommandResult = js.native
    
    def git(command: String): CommandResult = js.native
    def git(command: String, options: CommandOptions): CommandResult = js.native
    def git(command: String, options: Exec): CommandResult = js.native
    
    def grep(command: String): CommandResult = js.native
    def grep(command: String, options: CommandOptions): CommandResult = js.native
    def grep(command: String, options: Exec): CommandResult = js.native
    
    def groups(command: String): CommandResult = js.native
    def groups(command: String, options: CommandOptions): CommandResult = js.native
    def groups(command: String, options: Exec): CommandResult = js.native
    
    def hg(command: String): CommandResult = js.native
    def hg(command: String, options: CommandOptions): CommandResult = js.native
    def hg(command: String, options: Exec): CommandResult = js.native
    
    def hostname(command: String): CommandResult = js.native
    def hostname(command: String, options: CommandOptions): CommandResult = js.native
    def hostname(command: String, options: Exec): CommandResult = js.native
    
    def kill(command: String): CommandResult = js.native
    def kill(command: String, options: CommandOptions): CommandResult = js.native
    def kill(command: String, options: Exec): CommandResult = js.native
    
    def ln(command: String): CommandResult = js.native
    def ln(command: String, options: CommandOptions): CommandResult = js.native
    def ln(command: String, options: Exec): CommandResult = js.native
    
    def log(message: String): Unit = js.native
    
    def ls(command: String): CommandResult = js.native
    def ls(command: String, options: CommandOptions): CommandResult = js.native
    def ls(command: String, options: Exec): CommandResult = js.native
    
    def mkdir(command: String): CommandResult = js.native
    def mkdir(command: String, options: CommandOptions): CommandResult = js.native
    def mkdir(command: String, options: Exec): CommandResult = js.native
    
    def mv(command: String): CommandResult = js.native
    def mv(command: String, options: CommandOptions): CommandResult = js.native
    def mv(command: String, options: Exec): CommandResult = js.native
    
    def node(command: String): CommandResult = js.native
    def node(command: String, options: CommandOptions): CommandResult = js.native
    def node(command: String, options: Exec): CommandResult = js.native
    
    def npm(command: String): CommandResult = js.native
    def npm(command: String, options: CommandOptions): CommandResult = js.native
    def npm(command: String, options: Exec): CommandResult = js.native
    
    def prompt(message: String): String = js.native
    def prompt(message: String, options: PromptOptions): String = js.native
    
    def ps(command: String): CommandResult = js.native
    def ps(command: String, options: CommandOptions): CommandResult = js.native
    def ps(command: String, options: Exec): CommandResult = js.native
    
    def pwd(command: String): CommandResult = js.native
    def pwd(command: String, options: CommandOptions): CommandResult = js.native
    def pwd(command: String, options: Exec): CommandResult = js.native
    
    def rm(command: String): CommandResult = js.native
    def rm(command: String, options: CommandOptions): CommandResult = js.native
    def rm(command: String, options: Exec): CommandResult = js.native
    
    def rmdir(command: String): CommandResult = js.native
    def rmdir(command: String, options: CommandOptions): CommandResult = js.native
    def rmdir(command: String, options: Exec): CommandResult = js.native
    
    def rsync(command: String): CommandResult = js.native
    def rsync(command: String, options: CommandOptions): CommandResult = js.native
    def rsync(command: String, options: Exec): CommandResult = js.native
    
    var runtime: Host = js.native
    
    def scp(command: String): CommandResult = js.native
    def scp(command: String, options: CommandOptions): CommandResult = js.native
    def scp(command: String, options: Exec): CommandResult = js.native
    
    def sed(command: String): CommandResult = js.native
    def sed(command: String, options: CommandOptions): CommandResult = js.native
    def sed(command: String, options: Exec): CommandResult = js.native
    
    def silent(): Unit = js.native
    
    def sudo(command: String): CommandResult = js.native
    def sudo(command: String, options: SudoOptions): CommandResult = js.native
    
    def svn(command: String): CommandResult = js.native
    def svn(command: String, options: CommandOptions): CommandResult = js.native
    def svn(command: String, options: Exec): CommandResult = js.native
    
    def tail(command: String): CommandResult = js.native
    def tail(command: String, options: CommandOptions): CommandResult = js.native
    def tail(command: String, options: Exec): CommandResult = js.native
    
    def tar(command: String): CommandResult = js.native
    def tar(command: String, options: CommandOptions): CommandResult = js.native
    def tar(command: String, options: Exec): CommandResult = js.native
    
    def touch(command: String): CommandResult = js.native
    def touch(command: String, options: CommandOptions): CommandResult = js.native
    def touch(command: String, options: Exec): CommandResult = js.native
    
    def transfer(files: js.Array[CommandResult | String], remoteDir: String): js.Array[CommandResult] = js.native
    def transfer(files: js.Array[CommandResult | String], remoteDir: String, options: CommandOptions): js.Array[CommandResult] = js.native
    def transfer(files: CommandResult, remoteDir: String): js.Array[CommandResult] = js.native
    def transfer(files: CommandResult, remoteDir: String, options: CommandOptions): js.Array[CommandResult] = js.native
    
    def unzip(command: String): CommandResult = js.native
    def unzip(command: String, options: CommandOptions): CommandResult = js.native
    def unzip(command: String, options: Exec): CommandResult = js.native
    
    def verbose(): Unit = js.native
    
    def waitFor(fn: js.Function1[/* done */ js.Function1[/* result */ js.Any, Unit], Unit]): js.Any = js.native
    
    def whoami(command: String): CommandResult = js.native
    def whoami(command: String, options: CommandOptions): CommandResult = js.native
    def whoami(command: String, options: Exec): CommandResult = js.native
    
    def `with`(command: String, fn: js.Function0[Unit]): Unit = js.native
    def `with`(command: String, options: CommandOptions, fn: js.Function0[Unit]): Unit = js.native
    def `with`(options: CommandOptions, fn: js.Function0[Unit]): Unit = js.native
    
    def zip(command: String): CommandResult = js.native
    def zip(command: String, options: CommandOptions): CommandResult = js.native
    def zip(command: String, options: Exec): CommandResult = js.native
  }
}
