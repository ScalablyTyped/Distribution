organization := "org.scalablytyped"
name := "fontagon"
version := "1.1-dt-20211202Z-f937c9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "svg2ttf" % "5.0-dt-20211202Z-e17622",
  "org.scalablytyped" %%% "svgicons2svgfont" % "10.0-dt-20211202Z-fd0c93",
  "org.scalablytyped" %%% "ttf2woff" % "2.0-dt-20211202Z-9d1365")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
