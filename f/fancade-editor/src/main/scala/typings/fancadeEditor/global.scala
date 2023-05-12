package typings.fancadeEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * The type of a terminal.
    */
  @JSGlobal("TerminalType")
  @js.native
  object TerminalType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fancadeEditor.TerminalType & Double] = js.native
    
    /* 12 */ val Con: typings.fancadeEditor.TerminalType.Con & Double = js.native
    
    /* 13 */ val ConPtr: typings.fancadeEditor.TerminalType.ConPtr & Double = js.native
    
    /* 1 */ val Exe: typings.fancadeEditor.TerminalType.Exe & Double = js.native
    
    /* -1 */ val Missing: typings.fancadeEditor.TerminalType.Missing & Double = js.native
    
    /* 2 */ val Num: typings.fancadeEditor.TerminalType.Num & Double = js.native
    
    /* 3 */ val NumPtr: typings.fancadeEditor.TerminalType.NumPtr & Double = js.native
    
    /* 10 */ val Obj: typings.fancadeEditor.TerminalType.Obj & Double = js.native
    
    /* 11 */ val ObjPtr: typings.fancadeEditor.TerminalType.ObjPtr & Double = js.native
    
    /* 6 */ val Rot: typings.fancadeEditor.TerminalType.Rot & Double = js.native
    
    /* 7 */ val RotPtr: typings.fancadeEditor.TerminalType.RotPtr & Double = js.native
    
    /* 8 */ val Tru: typings.fancadeEditor.TerminalType.Tru & Double = js.native
    
    /* 9 */ val TruPtr: typings.fancadeEditor.TerminalType.TruPtr & Double = js.native
    
    /* 4 */ val Vec: typings.fancadeEditor.TerminalType.Vec & Double = js.native
    
    /* 5 */ val VecPtr: typings.fancadeEditor.TerminalType.VecPtr & Double = js.native
  }
  
  /**
    * Clear log.
    */
  inline def clearLog(): Unit = js.Dynamic.global.applyDynamic("clearLog")().asInstanceOf[Unit]
  
  /**
    * Connect blocks at position `(x1, y1, z1)` and `(x2, y2, z2)` using terminal indices `index1` and `index2`.
    * @param x1 The x position of the first block
    * @param y1 The y position of the first block
    * @param z1 The z position of the first block
    * @param index1 The index of the first terminal
    * @param x2 The x position of the second block
    * @param y2 The y position of the second block
    * @param z2 The z position of the second block
    * @param index2 The index of the second terminal
    */
  inline def connect(
    x1: Double,
    y1: Double,
    z1: Double,
    index1: Double,
    x2: Double,
    y2: Double,
    z2: Double,
    index2: Double
  ): Unit = (js.Dynamic.global.applyDynamic("connect")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], z1.asInstanceOf[js.Any], index1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], z2.asInstanceOf[js.Any], index2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findBlock(blockName: String): Double = js.Dynamic.global.applyDynamic("findBlock")(blockName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Find blocks by name.
    * @param blockName The name of the blocks to find
    * @returns The indices of the blocks found
    */
  inline def findBlocks(blockName: String): js.Array[Double] = js.Dynamic.global.applyDynamic("findBlocks")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Find block by name.
    * @param blockName The name of the block to find
    * @returns The index of the block found, otherwise 0
    * @alias {@link findBlock}
    */
  inline def findPrefab(PrefabName: String): Double = js.Dynamic.global.applyDynamic("findPrefab")(PrefabName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Find block by name.
    * @param blockName The name of the blocks to find
    * @returns The indices of the blocks found
    * @alias {@link findBlocks}
    */
  inline def findPrefabs(PrefabName: String): js.Array[Double] = js.Dynamic.global.applyDynamic("findPrefabs")(PrefabName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Get block at position `(x, y, z)` in level or open block.
    * @param x The x position of the block to get
    * @param y The y position of the block to get
    * @param z The z position of the block to get
    * @returns The index of the block at position `(x, y, z)`
    */
  inline def getBlock(x: Double, y: Double, z: Double): Double = (js.Dynamic.global.applyDynamic("getBlock")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Get current level index.
    * @returns The current level index
    */
  inline def getLevel(): Double = js.Dynamic.global.applyDynamic("getLevel")().asInstanceOf[Double]
  
  /**
    * Get number of levels.
    * @returns The number of levels
    */
  inline def getLevelCount(): Double = js.Dynamic.global.applyDynamic("getLevelCount")().asInstanceOf[Double]
  
  /**
    * Get size of level or open block.
    * @returns The size of level or open block
    */
  inline def getSize(): js.Tuple3[Double, Double, Double] = js.Dynamic.global.applyDynamic("getSize")().asInstanceOf[js.Tuple3[Double, Double, Double]]
  
  /**
    * Get terminal name of block at `(x, y, z)` and terminal index.
    * @param x The x position of the block
    * @param y The y position of the block
    * @param z The z position of the block
    * @param index The index of the terminal
    * @returns The terminal name (empty string if missing)
    */
  inline def getTerminalName(x: Double, y: Double, z: Double, index: Double): String = (js.Dynamic.global.applyDynamic("getTerminalName")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Get terminal type of block at `(x, y, z)` and terminal index.
    * @param x The x position of the block
    * @param y The y position of the block
    * @param z The z position of the block
    * @param index The index of the terminal
    * @returns The terminal type (-1 if missing)
    */
  inline def getTerminalType(x: Double, y: Double, z: Double, index: Double): TerminalType = (js.Dynamic.global.applyDynamic("getTerminalType")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[TerminalType]
  
  /**
    * Get version of the editor script engine.
    * @returns The version of the editor script engine
    */
  inline def getVersion(): Double = js.Dynamic.global.applyDynamic("getVersion")().asInstanceOf[Double]
  
  /**
    * Log printout.
    * @param value The value to print (only for strings and numbers for now)
    */
  inline def log(value: String): Unit = js.Dynamic.global.applyDynamic("log")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def log(value: Double): Unit = js.Dynamic.global.applyDynamic("log")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Set block at position `(x, y, z)` in level or open block.
    * @param x The x position to set the block at
    * @param y The y position to set the block at
    * @param z The z position to set the block at
    * @param blockIndex The index of the block to set
    */
  inline def setBlock(x: Double, y: Double, z: Double, blockIndex: Double): Unit = (js.Dynamic.global.applyDynamic("setBlock")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], blockIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setBlockValue(x: Double, y: Double, z: Double, valueIndex: Double, value: String): Unit = (js.Dynamic.global.applyDynamic("setBlockValue")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], valueIndex.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setBlockValue(x: Double, y: Double, z: Double, valueIndex: Double, value: js.Tuple3[Double, Double, Double]): Unit = (js.Dynamic.global.applyDynamic("setBlockValue")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], valueIndex.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Set block value at position `(x, y, z)`.
    * @param x The x position of the block
    * @param y The y position of the block
    * @param z The z position of the block
    * @param valueIndex The index of the value to set
    * @param value The value to set
    */
  inline def setBlockValue(x: Double, y: Double, z: Double, valueIndex: Double, value: Double): Unit = (js.Dynamic.global.applyDynamic("setBlockValue")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], valueIndex.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Change level.
    * @param levelIndex The level index to change to
    */
  inline def setLevel(levelIndex: Double): Unit = js.Dynamic.global.applyDynamic("setLevel")(levelIndex.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Update changes after using {@linkcode setBlock()}
    */
  inline def updateChanges(): Unit = js.Dynamic.global.applyDynamic("updateChanges")().asInstanceOf[Unit]
}
