organization := "org.scalablytyped"
name := "fontagon"
version := "1.1-dt-20211202Z-6b70fa"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "svg2ttf" % "5.0-dt-20211202Z-dd4871",
  "org.scalablytyped" %%% "svgicons2svgfont" % "10.0-dt-20211202Z-b019dc",
  "org.scalablytyped" %%% "ttf2woff" % "2.0-dt-20211202Z-c55d04")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
