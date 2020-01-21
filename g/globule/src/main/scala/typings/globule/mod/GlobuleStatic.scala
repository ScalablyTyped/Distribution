package typings.globule.mod

import typings.minimatch.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobuleStatic extends js.Object {
  /**
    * Returns a unique array of all file or directory paths that match the given globbing pattern(s)
    */
  def find(options: FindOptions): js.Array[String] = js.native
  /**
    * Returns a unique array of all file or directory paths that match the given globbing pattern(s)
    */
  def find(pattern: String): js.Array[String] = js.native
  def find(pattern: String, options: FindOptions): js.Array[String] = js.native
  /**
    * Returns a unique array of all file or directory paths that match the given globbing pattern(s)
    */
  def find(pattern: String, pattern2: String): js.Array[String] = js.native
  def find(pattern: String, pattern2: String, options: FindOptions): js.Array[String] = js.native
  /**
    * Returns a unique array of all file or directory paths that match the given globbing pattern(s)
    */
  def find(pattern: String, pattern2: String, pattern3: String): js.Array[String] = js.native
  def find(pattern: String, pattern2: String, pattern3: String, options: FindOptions): js.Array[String] = js.native
  def find(pattern: String, pattern2: String, pattern3: js.Array[String]): js.Array[String] = js.native
  def find(pattern: String, pattern2: String, pattern3: js.Array[String], options: FindOptions): js.Array[String] = js.native
  def find(pattern: String, pattern2: js.Array[String]): js.Array[String] = js.native
  def find(pattern: String, pattern2: js.Array[String], options: FindOptions): js.Array[String] = js.native
  def find(pattern: js.Array[String]): js.Array[String] = js.native
  def find(pattern: js.Array[String], options: FindOptions): js.Array[String] = js.native
  def find(pattern: js.Array[String], pattern2: String): js.Array[String] = js.native
  def find(pattern: js.Array[String], pattern2: String, options: FindOptions): js.Array[String] = js.native
  def find(pattern: js.Array[String], pattern2: js.Array[String]): js.Array[String] = js.native
  def find(pattern: js.Array[String], pattern2: js.Array[String], options: FindOptions): js.Array[String] = js.native
  /**
    * Tests pattern(s) against against one or more file paths and returns true if any files were matched, otherwise false.
    */
  def isMatch(patterns: String, filepaths: String): Boolean = js.native
  def isMatch(patterns: String, filepaths: String, options: IOptions): Boolean = js.native
  def isMatch(patterns: String, filepaths: js.Array[String]): Boolean = js.native
  def isMatch(patterns: String, filepaths: js.Array[String], options: IOptions): Boolean = js.native
  def isMatch(patterns: js.Array[String], filepaths: String): Boolean = js.native
  def isMatch(patterns: js.Array[String], filepaths: String, options: IOptions): Boolean = js.native
  def isMatch(patterns: js.Array[String], filepaths: js.Array[String]): Boolean = js.native
  def isMatch(patterns: js.Array[String], filepaths: js.Array[String], options: IOptions): Boolean = js.native
  /**
    * Given a set of source file paths, returns an array of src-dest file mapping objects
    */
  def mapping(filepaths: js.Array[String]): js.Array[OneMapping] = js.native
  /**
    * Given a set of source file paths, returns an array of src-dest file mapping objects
    */
  def mapping(filepaths: js.Array[String], filepaths2: js.Array[String]): js.Array[OneMapping] = js.native
  /**
    * Given a set of source file paths, returns an array of src-dest file mapping objects
    */
  def mapping(filepaths: js.Array[String], filepaths2: js.Array[String], filepaths3: js.Array[String]): js.Array[OneMapping] = js.native
  def mapping(
    filepaths: js.Array[String],
    filepaths2: js.Array[String],
    filepaths3: js.Array[String],
    options: MappingOptions
  ): js.Array[OneMapping] = js.native
  def mapping(filepaths: js.Array[String], filepaths2: js.Array[String], options: MappingOptions): js.Array[OneMapping] = js.native
  def mapping(filepaths: js.Array[String], options: MappingOptions): js.Array[OneMapping] = js.native
  /**
    * Given a set of source file paths, returns an array of src-dest file mapping objects
    */
  def mapping(options: MappingOptions): js.Array[OneMapping] = js.native
  /**
    * Match one or more globbing patterns against one or more file paths.
    * Returns a uniqued array of all file paths that match any of the specified globbing patterns.
    */
  def `match`(patterns: String, filepaths: String): js.Array[String] = js.native
  def `match`(patterns: String, filepaths: String, options: IOptions): js.Array[String] = js.native
  def `match`(patterns: String, filepaths: js.Array[String]): js.Array[String] = js.native
  def `match`(patterns: String, filepaths: js.Array[String], options: IOptions): js.Array[String] = js.native
  def `match`(patterns: js.Array[String], filepaths: String): js.Array[String] = js.native
  def `match`(patterns: js.Array[String], filepaths: String, options: IOptions): js.Array[String] = js.native
  def `match`(patterns: js.Array[String], filepaths: js.Array[String]): js.Array[String] = js.native
  def `match`(patterns: js.Array[String], filepaths: js.Array[String], options: IOptions): js.Array[String] = js.native
}

