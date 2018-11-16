package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>This is the File object - it allows you to stream data to and from files (As opposed to the <code>require(&#39;fs&#39;).readFile(..)</code> style functions that read an entire file).</p>
* <p>To create a File object, you must type <code>var fd = E.openFile(&#39;filepath&#39;,&#39;mode&#39;)</code> - see <a href="#l_E_openFile">E.openFile</a> for more information.</p>
* <p><strong>Note:</strong> If you want to remove an SD card after you have started using it, you <em>must</em> call <code>E.unmountSD()</code> or you may cause damage to the card.</p>
* 
* @url http://www.espruino.com/Reference#File
*/
@js.native
trait File
  extends /**
     * 
     * @return  
     */
ScalablyTyped.runtime.Instantiable0[File] {
  /**
       * <p>Close an open file.</p>
       * 
       * @url http://www.espruino.com/Reference#l_File_close
       */
  def close(): scala.Unit = js.native
  /**
       * <p>Pipe this file to a stream (an object with a &#39;write&#39; method)</p>
       * 
       * @param destination 
       * @param options 
       * @url http://www.espruino.com/Reference#l_File_pipe
       */
  def pipe(destination: js.Any, options: js.Any): scala.Unit = js.native
  /**
       * <p>Read data in a file in byte size chunks</p>
       * 
       * @param length 
       * @return  
       * @url http://www.espruino.com/Reference#l_File_read
       */
  def read(length: scala.Double): js.Any = js.native
  /**
       * <p>Seek to a certain position in the file</p>
       * 
       * @param nBytes 
       * @url http://www.espruino.com/Reference#l_File_seek
       */
  def seek(nBytes: scala.Double): scala.Unit = js.native
  /**
       * <p>Skip the specified number of bytes forward in the file</p>
       * 
       * @param nBytes 
       * @url http://www.espruino.com/Reference#l_File_skip
       */
  def skip(nBytes: scala.Double): scala.Unit = js.native
  /**
       * <p>write data to a file</p>
       * 
       * @param buffer 
       * @return  
       * @url http://www.espruino.com/Reference#l_File_write
       */
  def write(buffer: js.Any): scala.Double = js.native
}

