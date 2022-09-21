package typings.exaroton.mod

import typings.node.streamWebMod.ReadableStream
import typings.node.streamWebMod.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends StObject {
  
  /**
    * Apply data from the API Response
    */
  def applyData(`object`: js.Object): File = js.native
  
  val children: js.Array[File] | Null = js.native
  
  /* private */ val client: Client = js.native
  
  /**
    * Create a directory
    */
  def createAsDirectory(): js.Promise[Response] = js.native
  
  /**
    * Delete a file
    */
  def delete(): js.Promise[Response] = js.native
  
  /**
    * Download the data/content of a file to a local file
    *
    * If you want to use the content of a file directly use File.getContent() instead
    */
  def download(outputPath: String): js.Promise[Response] = js.native
  
  /**
    * Download the data/content of a file into a writable stream
    */
  def downloadToStream(outputStream: WritableStream[Any]): js.Promise[Response] = js.native
  
  /**
    * Get the children of a directory
    */
  def getChildren(): js.Promise[js.Array[File] | Null] = js.native
  
  /**
    * Get the data/content of a file
    *
    * If you want to download the file to a local file use File.download() instead
    */
  def getContent(): js.Promise[String] = js.native
  
  /**
    * Get file information from the API
    */
  def getInfo(): js.Promise[File] = js.native
  
  val isConfigFile: Boolean = js.native
  
  val isDirectory: Boolean = js.native
  
  val isLog: Boolean = js.native
  
  val isReadable: Boolean = js.native
  
  val isTextFile: Boolean = js.native
  
  val isWritable: Boolean = js.native
  
  /**
    * File name
    */
  var name: String = js.native
  
  /**
    * File path relative to server root
    */
  var path: String = js.native
  
  /**
    * Put the content of a file
    *
    * If you want to upload a local file use File.upload() instead
    */
  def putContent(content: String): js.Promise[Response] = js.native
  def putContent(content: js.Object): js.Promise[Response] = js.native
  
  /* private */ val server: Server = js.native
  
  /**
    * Set the API client
    */
  def setClient(client: Client): File = js.native
  
  def setPath(path: String): Unit = js.native
  
  /**
    * Set the server
    *
    * @param server
    */
  def setServer(server: Server): File = js.native
  
  val size: Double = js.native
  
  /**
    * Upload a local file
    *
    * If you want to upload the content of the file directly as a string use File.putContent() instead
    */
  def upload(inputPath: String): js.Promise[Response] = js.native
  
  /**
    * Upload from a readable stream
    */
  def uploadFromStream(inputStream: ReadableStream[Any]): js.Promise[Response] = js.native
}
