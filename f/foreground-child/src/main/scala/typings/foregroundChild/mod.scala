package typings.foregroundChild

import typings.foregroundChild.foregroundChildBooleans.`false`
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.SpawnOptions
import typings.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("foreground-child", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def foregroundChild(cmd: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(cmd.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def foregroundChild(cmd: String, cleanup: Cleanup): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(cmd.asInstanceOf[js.Any], cleanup.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def foregroundChild(cmd: js.Array[String]): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(cmd.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def foregroundChild(cmd: js.Array[String], cleanup: Cleanup): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(cmd.asInstanceOf[js.Any], cleanup.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def foregroundChild(program: String, args: js.Array[String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(program.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def foregroundChild(program: String, args: js.Array[String], cleanup: Cleanup): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(program.asInstanceOf[js.Any], args.asInstanceOf[js.Any], cleanup.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def foregroundChild(program: String, args: js.Array[String], spawnOpts: Unit, cleanup: Cleanup): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(program.asInstanceOf[js.Any], args.asInstanceOf[js.Any], spawnOpts.asInstanceOf[js.Any], cleanup.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def foregroundChild(program: String, args: js.Array[String], spawnOpts: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(program.asInstanceOf[js.Any], args.asInstanceOf[js.Any], spawnOpts.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def foregroundChild(program: String, args: js.Array[String], spawnOpts: SpawnOptions, cleanup: Cleanup): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(program.asInstanceOf[js.Any], args.asInstanceOf[js.Any], spawnOpts.asInstanceOf[js.Any], cleanup.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def foregroundChild(program: String, args: Unit, cleanup: Cleanup): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(program.asInstanceOf[js.Any], args.asInstanceOf[js.Any], cleanup.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def foregroundChild(program: String, args: Unit, spawnOpts: Unit, cleanup: Cleanup): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(program.asInstanceOf[js.Any], args.asInstanceOf[js.Any], spawnOpts.asInstanceOf[js.Any], cleanup.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def foregroundChild(program: String, args: Unit, spawnOpts: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(program.asInstanceOf[js.Any], args.asInstanceOf[js.Any], spawnOpts.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def foregroundChild(program: String, args: Unit, spawnOpts: SpawnOptions, cleanup: Cleanup): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(program.asInstanceOf[js.Any], args.asInstanceOf[js.Any], spawnOpts.asInstanceOf[js.Any], cleanup.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def foregroundChild(program: String, spawnOpts: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(program.asInstanceOf[js.Any], spawnOpts.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def foregroundChild(program: String, spawnOpts: SpawnOptions, cleanup: Cleanup): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("foregroundChild")(program.asInstanceOf[js.Any], spawnOpts.asInstanceOf[js.Any], cleanup.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  inline def normalizeFgArgs(fgArgs: FgArgs): js.Tuple4[
    /* program */ String, 
    /* args */ js.Array[String], 
    /* spawnOpts */ SpawnOptions, 
    /* cleanup */ Cleanup
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeFgArgs")(fgArgs.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[
    /* program */ String, 
    /* args */ js.Array[String], 
    /* spawnOpts */ SpawnOptions, 
    /* cleanup */ Cleanup
  ]]
  
  type Cleanup = js.Function2[
    /* code */ Double | Null, 
    /* signal */ Null | Signals, 
    js.UndefOr[
      Unit | Double | Signals | `false` | (js.Promise[js.UndefOr[Unit | Double | Signals | `false`]])
    ]
  ]
  
  type FgArgs = (js.Tuple2[js.Array[String] | String, js.UndefOr[Cleanup]]) | (js.Tuple3[
    (/* program */ js.Array[String]) | (/* program */ String), 
    js.UndefOr[js.Array[String] | SpawnOptions], 
    js.UndefOr[Cleanup]
  ]) | (js.Tuple4[
    /* program */ String, 
    /* args */ js.UndefOr[js.Array[String]], 
    /* opts */ js.UndefOr[SpawnOptions], 
    /* cleanup */ js.UndefOr[Cleanup]
  ])
}
