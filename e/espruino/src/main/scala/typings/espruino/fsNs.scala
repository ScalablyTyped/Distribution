package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
*/
@JSGlobal("fs")
@js.native
object fsNs extends js.Object {
  /**
    * <p>Append the data to the given file, created a new file if it doesn&#39;t exist</p>
    * <p>NOTE: Espruino does not yet support Async file IO, so this function behaves like the &#39;Sync&#39; version.</p>
    * 
    * @param path 
    * @param data 
    * @return  
    * @url http://www.espruino.com/Reference#l_fs_appendFile
    */
  def appendFile(path: js.Any, data: js.Any): Boolean = js.native
  /**
    * <p>Append the data to the given file, created a new file if it doesn&#39;t exist</p>
    * 
    * @param path 
    * @param data 
    * @return  
    * @url http://www.espruino.com/Reference#l_fs_appendFileSync
    */
  def appendFileSync(path: js.Any, data: js.Any): Boolean = js.native
  /**
    * <p>Create the directory</p>
    * <p>NOTE: Espruino does not yet support Async file IO, so this function behaves like the &#39;Sync&#39; version.</p>
    * 
    * @param path 
    * @return  
    * @url http://www.espruino.com/Reference#l_fs_mkdir
    */
  def mkdir(path: js.Any): Boolean = js.native
  /**
    * <p>Create the directory</p>
    * 
    * @param path 
    * @return  
    * @url http://www.espruino.com/Reference#l_fs_mkdirSync
    */
  def mkdirSync(path: js.Any): Boolean = js.native
  /**
    * 
    * @param source 
    * @param destination 
    * @param options 
    * @url http://www.espruino.com/Reference#l_fs_pipe
    */
  def pipe(source: js.Any, destination: js.Any, options: js.Any): Unit = js.native
  /**
    * <p>Read all data from a file and return as a string</p>
    * <p>NOTE: Espruino does not yet support Async file IO, so this function behaves like the &#39;Sync&#39; version.</p>
    * 
    * @param path 
    * @return  
    * @url http://www.espruino.com/Reference#l_fs_readFile
    */
  def readFile(path: js.Any): js.Any = js.native
  /**
    * <p>Read all data from a file and return as a string.</p>
    * <p><strong>Note:</strong> The size of files you can load using this method is limited by the amount of available RAM. To read files a bit at a time, see the <code>File</code> class.</p>
    * 
    * @param path 
    * @return  
    * @url http://www.espruino.com/Reference#l_fs_readFileSync
    */
  def readFileSync(path: js.Any): js.Any = js.native
  /**
    * <p>List all files in the supplied directory, returning them as an array of strings.</p>
    * <p>NOTE: Espruino does not yet support Async file IO, so this function behaves like the &#39;Sync&#39; version.</p>
    * 
    * @param path 
    * @return  
    * @url http://www.espruino.com/Reference#l_fs_readdir
    */
  def readdir(path: js.Any): js.Any = js.native
  /**
    * <p>List all files in the supplied directory, returning them as an array of strings.</p>
    * 
    * @param path 
    * @return  
    * @url http://www.espruino.com/Reference#l_fs_readdirSync
    */
  def readdirSync(path: js.Any): js.Any = js.native
  /**
    * <p>Return information on the given file. This returns an object with the following
    * fields:</p>
    * <p>size: size in bytes
    * dir: a boolean specifying if the file is a directory or not
    * mtime: A Date structure specifying the time the file was last modified</p>
    * 
    * @param path 
    * @return  
    * @url http://www.espruino.com/Reference#l_fs_statSync
    */
  def statSync(path: js.Any): js.Any = js.native
  /**
    * <p>Delete the given file</p>
    * <p>NOTE: Espruino does not yet support Async file IO, so this function behaves like the &#39;Sync&#39; version.</p>
    * 
    * @param path 
    * @return  
    * @url http://www.espruino.com/Reference#l_fs_unlink
    */
  def unlink(path: js.Any): Boolean = js.native
  /**
    * <p>Delete the given file</p>
    * 
    * @param path 
    * @return  
    * @url http://www.espruino.com/Reference#l_fs_unlinkSync
    */
  def unlinkSync(path: js.Any): Boolean = js.native
  /**
    * <p>Write the data to the given file</p>
    * <p>NOTE: Espruino does not yet support Async file IO, so this function behaves like the &#39;Sync&#39; version.</p>
    * 
    * @param path 
    * @param data 
    * @return  
    * @url http://www.espruino.com/Reference#l_fs_writeFile
    */
  def writeFile(path: js.Any, data: js.Any): Boolean = js.native
  /**
    * <p>Write the data to the given file</p>
    * 
    * @param path 
    * @param data 
    * @return  
    * @url http://www.espruino.com/Reference#l_fs_writeFileSync
    */
  def writeFileSync(path: js.Any, data: js.Any): Boolean = js.native
}

